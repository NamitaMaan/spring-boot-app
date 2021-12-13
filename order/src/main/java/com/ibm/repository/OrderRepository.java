package com.ibm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{
	

	List<Orders> findByCustNumber(Long custNumber);
	
	Orders findByOrderNumber(Long orderNumber);

	List<Orders> findAll();
	
}
