package com.cg.go.greatoutdoor.dto.cartItem;

import java.util.Map;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cg.go.greatoutdoor.entity.ProductEntity;


public class UpdateCartItemRequest {
	
	@Id
	private Integer cartId;
	@OneToOne
	private ProductEntity product ;// product ,quantity
	

	public UpdateCartItemRequest( Integer cartId, ProductEntity product) {
		
		this.product = product;
	}

	public UpdateCartItemRequest() {
		
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
	
