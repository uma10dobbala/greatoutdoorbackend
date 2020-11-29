package com.cg.go.greatoutdoor.dto.cartItem;

import java.util.Map;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cg.go.greatoutdoor.entity.ProductEntity;


public class CreateCartItemRequest {
	

	@OneToOne
	private ProductEntity product ;// product 
	

	public CreateCartItemRequest(ProductEntity product) {
		
		this.product = product;
	}

	public CreateCartItemRequest() {
		
	}
	

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

}
