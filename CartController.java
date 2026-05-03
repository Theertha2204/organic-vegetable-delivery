package com.farmfresh.FarmFresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.farmfresh.FarmFresh.entity.Product;
import com.farmfresh.FarmFresh.service.CartService;
import com.farmfresh.FarmFresh.service.ProductService;

@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/cart")
	public String viewCart(Model model)
	{
		model.addAttribute("cartItems",cartService.getAllCartItems());
		return "cart";
	}
	
	@GetMapping("/cart/add/{id}")
	public String addToCart(@PathVariable Long id)
	{
		Product product=productService.getProductById(id);
		cartService.addToCart(product);
		return "redirect:/cart";
	}
	
	@GetMapping("/cart/remove/{id}")
	public String removeFromCart(@PathVariable Long id)
	{
		cartService.removeCartItem(id);
		return "redirect:/cart";
	}

}
