package com.cg.go.greatoutdoor.service;
import java.util.List;

import com.cg.go.greatoutdoor.entity.CartItemEntity;

public interface ICartService {
	
	
	public CartItemEntity addCart(CartItemEntity cartItemEntity);

	public CartItemEntity updateCart(CartItemEntity cartItemEntity);

	public List<CartItemEntity> findAllCartItems();

}
