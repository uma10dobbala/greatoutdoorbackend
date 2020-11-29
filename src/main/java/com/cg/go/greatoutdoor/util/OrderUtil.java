package com.cg.go.greatoutdoor.util;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.go.greatoutdoor.dto.order.CreateOrderRequest;
import com.cg.go.greatoutdoor.dto.order.UpdateOrderRequest;
import com.cg.go.greatoutdoor.entity.OrderEntity;


@Component
public class OrderUtil {

	
	public OrderEntity convertToOrder(CreateOrderRequest order) {
		
		Integer totalQuantity=0;
		double totalPrice=0;
		
		OrderEntity orderEntity=new OrderEntity();
		orderEntity.setUserId(order.getUserId());
		orderEntity.setTotalPrice(totalPrice);
		orderEntity.setTotalQuantity(totalQuantity);
		orderEntity.setDeliveryDate(order.getDeliveryDate());
		orderEntity.setDispatchDate(order.getDispatchDate());
		return orderEntity;
	}
public OrderEntity convertToOrder(UpdateOrderRequest order) {
		
		Integer totalQuantity=0;
		double totalPrice=0;
		
		OrderEntity orderEntity=new OrderEntity();
		orderEntity.setUserId(order.getUserId());
		orderEntity.setTotalPrice(totalPrice);
		orderEntity.setTotalQuantity(totalQuantity);
		orderEntity.setDeliveryDate(order.getDeliveryDate());
		orderEntity.setDispatchDate(order.getDispatchDate());
		return orderEntity;
	}
}
