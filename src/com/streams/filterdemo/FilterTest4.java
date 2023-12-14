package com.streams.filterdemo;

import java.util.ArrayList;
import java.util.List;

class Product{
	int productNo;
	String productName;
	double price;
	public Product(int productNo, String productName, double price) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}
	
	
}
public class FilterTest4 {
	public static void main(String[] args) {
		List<Product> products=new ArrayList<>();
		products.add(new Product(1,"hp laptop",25000));
		products.add(new Product(1,"dell laptop",30000));
		products.add(new Product(1,"acer laptop",10000));
		products.add(new Product(1,"lenovo laptop",50000));
		//print the products whose price is grater than or equal to 30000
		products.stream().filter(product->product.price>=30000).forEach(product->System.out.println(product.productName+" "+product.price));
	}
	

}
