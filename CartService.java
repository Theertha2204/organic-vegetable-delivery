package com.farmfresh.FarmFresh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmfresh.FarmFresh.entity.CartItem;
import com.farmfresh.FarmFresh.entity.Product;
import com.farmfresh.FarmFresh.repository.CartItemRepository;

@Service
public class CartService {
	
	@Autowired
	private CartItemRepository cartItemRepository;
	
	public void addToCart(Product product)
	{
		CartItem cartItem=new CartItem(product,1,product.getPrice());
		cartItemRepository.save(cartItem);
	}
	
	public List<CartItem> getAllCartItems()
	{
		return cartItemRepository.findAll();
	}
	
	public void removeCartItem(Long id)
	{
		cartItemRepository.deleteById(id);
	}

}
