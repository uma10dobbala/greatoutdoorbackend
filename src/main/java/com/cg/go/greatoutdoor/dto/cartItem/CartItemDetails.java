package com.cg.go.greatoutdoor.dto.cartItem;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cg.go.greatoutdoor.entity.ProductEntity;

public class CartItemDetails {
	@GeneratedValue
	@Id
	private Integer cartId;

	private ProductEntity product ;// product ,quantity
	

	public CartItemDetails( Integer cartId, ProductEntity product) {
		this.cartId=cartId;
		this.product = product;
	}

	public CartItemDetails() {
		
	}
	
	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
}
