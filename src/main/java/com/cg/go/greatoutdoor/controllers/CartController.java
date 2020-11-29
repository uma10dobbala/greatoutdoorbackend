package com.cg.go.greatoutdoor.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.greatoutdoor.dto.cartItem.CartItemDetails;
import com.cg.go.greatoutdoor.dto.cartItem.CreateCartItemRequest;
import com.cg.go.greatoutdoor.dto.cartItem.UpdateCartItemRequest;
import com.cg.go.greatoutdoor.entity.CartItemEntity;
import com.cg.go.greatoutdoor.service.ICartService;
import com.cg.go.greatoutdoor.util.CartItemUtil;


@CrossOrigin(origins="*")
@RequestMapping("/cart")
@RestController
public class CartController {
		
	@Autowired
	public ICartService cartService;
	
	@Autowired
	public CartItemUtil cartItemUtil;
	
	/**
     * effective url will be http://localhost:8585/cartitem/add
     */
	
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public CartItemDetails add(@RequestBody CreateCartItemRequest cartItem) {
        CartItemEntity cartItem1 =new CartItemEntity(cartItem.getProduct());
        cartItem1 = cartService.addCart(cartItem1);
        CartItemDetails details = toDetails(cartItem1);
        return details;
    }
	

	@PutMapping("/update")
    public CartItemDetails update(@RequestBody UpdateCartItemRequest requestData) {
		CartItemEntity cartItem =new CartItemEntity(requestData.getProduct());
		cartItem.setCartId(requestData.getCartId());
		cartItem = cartService.updateCart(cartItem);
        CartItemDetails details = toDetails(cartItem);
        return details;
    }

	@GetMapping("/allCartItems")
    public List<CartItemDetails> getAllCartItems() {
    	List<CartItemEntity> cartItem = cartService.findAllCartItems();
        List<CartItemDetails> details = toDetails(cartItem);
        return details;
    }
    

	//To convert cartItemEntity to CartItemDetails
	private CartItemDetails toDetails(CartItemEntity cartItem) {
		CartItemDetails details =new CartItemDetails(cartItem.getCartId(),cartItem.getProduct());
		return details;
	}
	
	//To convert list of cartItemEntities to list of CartItemDetails
	private List<CartItemDetails> toDetails(List<CartItemEntity> cartItem) {
		List<CartItemDetails> cartDetails=new ArrayList<>();
    	for(CartItemEntity cart:cartItem) {
    		CartItemDetails details=toDetails(cart);
    		cartDetails.add(details);
    	}
		return cartDetails;
	}
       
}