package com.farmfresh.FarmFresh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmfresh.FarmFresh.entity.Orders;
import com.farmfresh.FarmFresh.repository.OrdersRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrdersRepository ordersRepository;
	
	public void saveOrder(Orders order)
	{
		ordersRepository.save(order);
	}
	
	public List<Orders> getAllOrders()
	{
		return ordersRepository.findAll();
	}

}
