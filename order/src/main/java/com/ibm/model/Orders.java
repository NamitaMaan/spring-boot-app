package com.ibm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Orders {

@Id
@GeneratedValue
	private int id;
	private Long orderNumber;
	private double amount;
	private Long custNumber;
	private int prodNumber;
	
	public Orders() {
	}

	public Orders(int id, Long orderNumber, double amount, Long custNumber, int prodNumber) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.amount = amount;
		this.custNumber = custNumber;
		this.prodNumber = prodNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getTotalAmount() {
		return amount;
	}

	public void setTotalAmount(double amount) {
		this.amount = amount;
	}

	public Long getCustNumber() {
		return custNumber;
	}

	public void setCustNumber(Long custNumber) {
		this.custNumber = custNumber;
	}

	public int getProdNumber() {
		return prodNumber;
	}

	public void setProdNumber(int prodNumber) {
		this.prodNumber = prodNumber;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNumber=" + orderNumber + ", amount=" + amount + ", custNumber=" + custNumber
				+ ", prodNumber=" + prodNumber + "]";
	}
	
/*
	public Order(int id, Long orderNumber, double amount, Long custNumber, int prodNumber, Products products) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.amount = amount;
		this.custNumber = custNumber;
		this.prodNumber = prodNumber;
		this.products = products;
	}

	public int getNumber() {
		return id;
	}

	public void setNumber(int id) {
		this.id = id;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getTotalAmount() {
		return amount;
	}

	public void setTotalAmount(double amount) {
		this.amount = amount;
	}

	public Long getCustNumber() {
		return custNumber;
	}

	public void setCustNumber(Long custNumber) {
		this.custNumber = custNumber;
	}

	public int getProdNumber() {
		return prodNumber;
	}

	public void setProdNumber(int prodNumber) {
		this.prodNumber = prodNumber;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNumber=" + orderNumber + ", amount=" + amount + ", custNumber=" + custNumber
				+ ", prodNumber=" + prodNumber + ", products=" + products + "]";
	}
*/
}
