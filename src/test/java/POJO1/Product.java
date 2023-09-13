package POJO1;

import java.util.Arrays;

import org.apache.juneau.annotation.Beanc;

public class Product

//POJO :- Plain Old Java Object
//Cant Extend anything
//Cant Implement anything

{
	
	private String name ;
	private String price;
    private String Color;
    private String[] sellerNames;
    
    
    @Beanc(properties="name,price,color,sellerNames")
	public Product(String name, String price, String color, String[] sellerNames) {
		super();
		this.name = name;
		this.price = price;
		Color = color;
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
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public String[] getSellerNames() {
		return sellerNames;
	}


	public void setSellerNames(String[] sellerNames) {
		this.sellerNames = sellerNames;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", Color=" + Color + ", sellerNames="
				+ Arrays.toString(sellerNames) + "]";
	}
    
	
  
}
