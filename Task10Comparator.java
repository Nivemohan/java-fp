STOCK CLASS:
package stock;

public class Stock {
	private String identity;
	private String name;
	private int quantity;
	private double price;
	private String manufacturedDate;
	private String expiryDate;
	public Stock(String identity, String name, int quantity, double price, String manufacturedDate, String expiryDate) {
		super();
		this.identity = identity;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
		this.expiryDate = expiryDate;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String toString() {
		return String.format("%-10s %-20s %-3d Rs.%-5.2f %-10s %-10s\n",identity,name,quantity,price,manufacturedDate,expiryDate);
	}
	
}

SOLUTION CLASS:
package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import compataros.ExpiryAscending;
import compataros.ExpiryDescending;
import compataros.IdentityAscending;
import compataros.IdentityDescending;
import compataros.ManufacturedAscending;
import compataros.ManufacturedDescending;
import compataros.NameAscending;
import compataros.NameDescending;
import compataros.PriceAscending;
import compataros.PriceDescending;
import compataros.QuantityAscending;
import compataros.QuantityDescending;
import stock.Stock;

public class Solution {

	public static void main(String[] args) throws IOException{
		List<Stock> stock= new LinkedList<Stock>();
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String stop;
		do{
			System.out.print("Enter product identity:");
			String identity=bf.readLine();
			System.out.print("\nEnter product name:");
			String name=bf.readLine();
			System.out.print("\nEnter product quantity:");
			int quantity=Integer.parseInt(bf.readLine());
			System.out.print("\nEnter product price:");
			double price=Double.parseDouble(bf.readLine());
			System.out.print("\nEnter product manufactured date:");
			String manufacturedDate=bf.readLine();
			System.out.print("\nEnter product expiry date:");
			String expiryDate=bf.readLine();
			stock.add(new Stock(identity, name, quantity, price, manufacturedDate,
expiryDate));
			System.out.print("\nDo you want to add more");
			stop=bf.readLine();
			
		}while(!stop.equalsIgnoreCase("no"));
		
		System.out.println("1.Identity Ascending\n2.Identity Descendinh\n3.Name Ascending\n4.Name Descending\n5.Quantity Ascending\n6.Quantity Descending"
				+ "\n7.Price Ascending\n8.Price Descending\n9.Manufactured Date Ascending\n10.Manufactured Date Descending\n11.Expiry DateAscending\n12.Expiry Date Descending" );
		System.out.println("Enter your choice for sort:");
		int choice=Integer.parseInt(bf.readLine());
		switch(choice){
		case 1:stock.sort(new IdentityAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 2:stock.sort(new IdentityDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 3:stock.sort(new NameAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 4:stock.sort(new NameDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 5:stock.sort(new QuantityAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 6:stock.sort(new QuantityDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 7:stock.sort(new PriceAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 8:stock.sort(new PriceDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 9:stock.sort(new ManufacturedAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 10:stock.sort(new ManufacturedDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 11:stock.sort(new ExpiryAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		case 12:stock.sort(new ExpiryDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		break;
		
		}
	}

}

IDENTITY ASCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class IdentityAscending implements Comparator<Stock> {
	
  public int compare(Stock arg0, Stock arg1) {
	  
	  return arg0.getIdentity().compareTo(arg1.getIdentity());
  }
}
		
IDENTITY DESCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class IdentityDescending implements Comparator<Stock> {
	
  public int compare(Stock arg0, Stock arg1) {
	  
	  return arg1.getIdentity().compareTo(arg0.getIdentity());
  }
}
		

NAME ASCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class NameAscending implements Comparator<Stock> {
	public int compare(Stock o1, Stock o2) {
		return o1.getName().compareTo(o2.getName());
		
	}
	

}
NAME DESCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class NameDescending implements Comparator<Stock> {
	public int compare(Stock o1, Stock o2) {
		return o2.getName().compareTo(o1.getName());
		
	}
	

}
QUANTITY ASCENDING CLASS:
package compataros;

import java.util.Comparator;
import stock.Stock;

public class QuantityAscending implements Comparator<Stock> {

	public int compare(Stock o1, Stock o2) {
		return Integer.compare(o1.getQuantity(),o2.getQuantity());
			
	}


}

QUANTITY DESCENDING CLASS:
package compataros;

import java.util.Comparator;
import stock.Stock;

public class QuantityDescending implements Comparator<Stock> {

	public int compare(Stock o1, Stock o2) {
		return Integer.compare(o2.getQuantity(),o1.getQuantity());
			
	}


}
PRICE ASCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class PriceAscending implements Comparator<Stock> {
	public int compare(Stock o1, Stock o2) {
		return Double.compare(o1.getPrice(),o2.getPrice());
	}

}
PRICE DESCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class PriceDescending implements Comparator<Stock> {
	public int compare(Stock o1, Stock o2) {
		return Double.compare(o2.getPrice(),o1.getPrice());
	}

}
MANUFACTURED DATE ASCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class ManufacturedAscending implements Comparator<Stock>{

	public int compare(Stock o1, Stock o2) {
	return o1.getManufacturedDate().compareTo(o2.getManufacturedDate());
		
	}

}
MANUFACTURED DATE DESCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class ManufacturedDescending implements Comparator<Stock>{

	public int compare(Stock o1, Stock o2) {
	return o2.getManufacturedDate().compareTo(o1.getManufacturedDate());
		
	}

}
EXPIRY DATE ASCENDING CLASS:
package compataros;

import java.util.Comparator;

import stock.Stock;

public class ExpiryAscending implements Comparator<Stock>{
	public int compare(Stock o1, Stock o2) {
		return o1.getExpiryDate().compareTo(o2.getExpiryDate());
			
	}

}

EXPIRY DATE DESCENDING CLASS:
package compataros;
import java.util.Comparator;
import stock.Stock;
public class ExpiryDescending implements Comparator<Stock>{
	public int compare(Stock o1, Stock o2) {
		return o2.getExpiryDate().compareTo(o1.getExpiryDate());
	}
}
