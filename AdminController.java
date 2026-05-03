package com.farmfresh.FarmFresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.farmfresh.FarmFresh.entity.Product;
import com.farmfresh.FarmFresh.service.OrderService;
import com.farmfresh.FarmFresh.service.ProductService;

@Controller
public class AdminController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/admin")
	public String adminDashBoard(Model model)
	{
		model.addAttribute("products",productService.getAllProducts());
		model.addAttribute("orders", orderService.getAllOrders());
		return "admin Dashboard";
	}
	
	
	@GetMapping("/admin/add-product")
	public String addProductPage(Model model)
	{
		model.addAttribute("product",new Product());
		return "add Product";
	}
	
	
	@PostMapping("/admin/save-product")
	public String saveProduct(@ModelAttribute Product product)
	{
		productService.saveProduct(product);
		return "redirect:/admin";
	}
}
