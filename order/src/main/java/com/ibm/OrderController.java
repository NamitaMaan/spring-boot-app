package com.ibm;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ibm.model.Orders;
import com.ibm.service.OrderService;

@RestController
@RequestMapping("/")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	//get all orders 
	@GetMapping("")
	public ResponseEntity<List<Orders>> getAll()
	{
		System.out.println("enter getAll orders");
		return ResponseEntity.ok(orderService.findAll());
	}
	
	//get all orders of Customer by Cust Number
	@GetMapping("/cust/{custNumber}")
	public ResponseEntity<List<Orders>> getOrderByCustNumber(@PathVariable Long custNumber)
	{
		return ResponseEntity.ok(orderService.getCustOrders(custNumber));
	}
		
	//get orders by OrderId			
	@GetMapping("/order/{orderNumber}")
	public ResponseEntity<Orders>  getOrdersByOrderNumber(  @PathVariable("orderNumber") Long orderNumber){
		return ResponseEntity.ok(orderService.getOrder(orderNumber));
	}
	
	@PostMapping
	public ResponseEntity<Orders> createOrders(@RequestBody Orders order)
	{
		Orders result = orderService.createOrders(order);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{orderNumber}")
				.buildAndExpand(result.getId()).toUri();		
			return ResponseEntity.created(location).body(result);
	}
	
	@PutMapping("/order/{orderNumber}")
	public ResponseEntity<@Valid Orders> updateOrder( @PathVariable Long orderNumber, @Valid @RequestBody Orders order)
	{
		Orders updatedOrder = orderService.updateOrder(orderNumber, order);
		if(updatedOrder!=null)
		{
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("order/{orderNumber}")
				.buildAndExpand(order.getOrderNumber()).toUri();
		
			return ResponseEntity.created(location).body(order);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
		
	}

	@DeleteMapping("/order/{orderNumber}")
	public ResponseEntity<?>  deleteOrder( @PathVariable Long orderNumber)
	{
		System.out.println("enter deleteOrder orderNumber="+orderNumber);
		
		if(orderService.deleteOrder(orderNumber))
			return ResponseEntity.noContent().build();
		else
			return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/cust/{custNumber}")
	public ResponseEntity<?>  deleteCustOrder(@PathVariable("custNumber") Long custNumber)
	{
		System.out.println("enter deleteCustOrder custNumber="+custNumber);
		
		if(orderService.deleteCustOrder(custNumber))
			return ResponseEntity.noContent().build();
		else
			return ResponseEntity.notFound().build();
	}

}	