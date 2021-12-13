package com.ibm.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Orders;
import com.ibm.model.Products;
import com.ibm.repository.OrderRepository;
//import com.ibm.exception.ProductsNotFoundException;
//import com.ibm.exception.IdnotMatchException;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepo;
	
	public Orders getOrder(Long orderId) {
		return orderRepo.findByOrderId(orderId);
	}
	
	public List<Orders> getCustOrders(Long custId) {
		return orderRepo.findByCustId(custId);
	}

//	public Orders getOrderByCustAndOrderId(Long custId, Long orderId) {
//		return orderRepo.findByCustIdAndOrderId(custId, orderId);
//	}
	
	public Orders createOrders(Orders order) {
		Orders result = orderRepo.save(order);
		return result;
	}
	
	
	public boolean updateOrder(Long orderId, Orders order) {
		if (orderId == order.getOrderId()){
			getOrder(orderId);
			orderRepo.save(order);
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public boolean deleteCustOrder(Long id) {
		System.out.println("deleteCustOrder result for id="+id);
		List<Orders> result = getCustOrders(id);
		System.out.println(" result  is :"+result);
		for(Orders r:result) {
			orderRepo.delete(r);
		}
		
		return true;
	}
	
	
	public boolean deleteOrder(Long id) {
		System.out.println(" result for id="+id);
		Orders result = getOrder(id);
		System.out.println(" result  is :"+result);
		orderRepo.delete(result);
		return true;
	}
	
}