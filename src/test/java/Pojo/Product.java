package Pojo;

import org.apache.juneau.annotation.Beanc;

public class Product

//POJO : Plain Old Java object
{
	private String name;
	private String price;
	private String color;
	private String[] sellerNames;
	
	
	@Beanc(properties="name,price,color,sellerNames") // exactly same will e dispplay in json or xml file.
	public Product(String name, String price, String color, String[] sellerNames) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerNames = sellerNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getSellerNames() {
		return sellerNames;
	}

	public void setSellerNames(String[] sellerNames) {
		this.sellerNames = sellerNames;
	}
	
}
