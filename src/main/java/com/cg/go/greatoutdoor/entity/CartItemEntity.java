package com.cg.go.greatoutdoor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.Objects;

@Table(name="cartItem")
@Entity
public class CartItemEntity {
	@GeneratedValue
	@Id
	private Integer cartId;
	
	@OneToOne
	private ProductEntity product ;// product ,quantity
	

	public CartItemEntity(ProductEntity product) {
		
		this.product = product;
	}

	public CartItemEntity() {
		
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

	@Override
	public int hashCode() {
		int hash=Objects.hashCode(cartId);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItemEntity other = (CartItemEntity) obj;
		if (cartId != other.cartId)
			return false;
		return true;
	}
}