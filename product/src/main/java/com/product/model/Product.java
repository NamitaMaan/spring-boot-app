package com.product.model;

public class Product {
	
	String productId;
	String decsription;
	String quantity;
	Double price;
	int noOfItem;
	
	public Product(String productId, String decsription, String quantity, Double price,int noOfItem) {
		super();
		this.productId = productId;
		this.decsription = decsription;
		this.quantity = quantity;
		this.price = price;
		this.noOfItem = noOfItem;
	}
	public Product() {
		
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getDecsription() {
		return decsription;
	}
	public void setDecsription(String decsription) {
		this.decsription = decsription;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getNoOfItem() {
		return noOfItem;
	}
	public void setNoOfItem(int noOfItem) {
		this.noOfItem = noOfItem;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", decsription=" + decsription + ", quantity=" + quantity
				+ ", price=" + price + ", noOfItem="+noOfItem+" ]";
	}
}
