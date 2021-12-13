package com.ibm.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Orders;
import com.ibm.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepo;
	
	public Orders getOrder(Long orderNumber) {
		return orderRepo.findByOrderNumber(orderNumber);
	}
	
	public List<Orders> getCustOrders(Long custNumber) {
		return orderRepo.findByCustNumber(custNumber);
	}
	
	public Orders createOrders(Orders order) {
		Orders result = orderRepo.save(order);
		return result;
	}
		
	public Orders updateOrder(Long orderNumber, Orders order) {
		
		if (orderNumber.equals(order.getOrderNumber())){
			getOrder(orderNumber);
			Orders result =  orderRepo.save(order);
			return result;
		} else {
			
			return null;
		}
	}
	
	
	
	public boolean deleteCustOrder(Long id) {
		List<Orders> result = getCustOrders(id);
		for(Orders r:result) {
			orderRepo.delete(r);
		}
		
		return true;
	}
	
	
	public boolean deleteOrder(Long id) {
		Orders result = getOrder(id);
		orderRepo.delete(result);
		return true;
	}

	public List<Orders> findAll() {
		return orderRepo.findAll();
		 }
	
}