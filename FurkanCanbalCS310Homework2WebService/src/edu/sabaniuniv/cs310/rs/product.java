package edu.sabaniuniv.cs310.rs;

public class product {
 private String productName;
 private double price;
 private int Stock;
 
 public product() {
	 
super();
 }
 public product(String productName,double price,int Stock) {
		
		super();
		this.productName=productName;
		this .price=price;
		this.Stock=Stock;
			
 }

 public String getName() {
	  return productName; 
	  }
 public double getPrice() {
	  return price; 
	  }
 public int getStock() {
	  return Stock; 
	  }
 
	 public void setName(String productName) {
		 this.productName=productName; 
		  }
	 public void setPrice(double price) {
		  this.price=price; 
		  }
	 public void setStock(int stock) {
		  this.Stock=Stock; 
		  }
 
}
