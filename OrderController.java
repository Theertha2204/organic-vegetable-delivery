package com.farmfresh.FarmFresh.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.farmfresh.FarmFresh.entity.Orders;
import com.farmfresh.FarmFresh.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/checkout")
	public String checkoutPage()
	{
		return "checkout";
	}
	
	@PostMapping("/place-order")
	public String placeOrder(@ModelAttribute Orders order)
	{
		order.setOrderDate(LocalDateTime.now());
		order.setStatus("Ordered");
		orderService.saveOrder(order);
		return "redirect:/orders";
	}
	
	@GetMapping("/orders")
	public String showOrders(Model model)
	{
		model.addAttribute("orders",orderService.getAllOrders());
		return "orders";
	}
	
}
