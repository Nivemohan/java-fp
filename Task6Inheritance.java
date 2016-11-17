SHAPE CLASS:

package sample;

public class Shape {
	private String color;
	private boolean filled;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public Shape() {
		super();
		this.color = "";
		this.filled = false;
	}
	

}
CIRCLE CLASS:
package circle;

import sample.Shape;

public class Circle extends Shape {
	private double radius;
	private static final double PI= 3.14;
	public double area(){
		return this.radius * this.radius * Circle.PI;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
		super();
		this.radius = 0.0;
	}
	
	
	
}

RECTANGLE CLASS:
package rectangle;

import sample.Shape;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	public double area(){
		return this.length * this.breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public Rectangle(String color, boolean filled, double length, double breadth) {
		super(color, filled);
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		super();
		this.length = 0.0;
		this.breadth = 0.0;
	}
	
	

}

TRIANGLE CLASS:
package triangle;

import sample.Shape;

public class Triangle extends Shape {
	private double base;
	private double height;
	private final static double half=0.5;
	public double area(){
		return Triangle.half * this.base * this.height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle(String color, boolean filled, double base, double height) {
		super(color, filled);
		this.base = base;
		this.height = height;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Triangle() {
		super();
		this.base = 0.0;
		this.height = 0.0;
	}
	

}


CYLINDER CLASS:
package cylinder;

import circle.Circle;

public class Cylinder extends Circle {
	private double height;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return super.area() * this.height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Cylinder(String color, boolean filled, double radius, double height) {
		super(color, filled, radius);
		this.height = height;
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder() {
		super();
		this.height = 0.0;
	}
	
		
}

SOLUTION CLASS:
package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sample.Shape;
import circle.Circle;
import cylinder.Cylinder;
import rectangle.Rectangle;
import triangle.Triangle;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.CIRCLE  2.TRIANGLE  3.RECTANGLE  4.CYLINDER");
		System.out.println("ENTER THE CHOICE:");
		int choice= Integer.parseInt(bf.readLine());
		System.out.println("ENTER COLOR: ");
		String color=bf.readLine();
		System.out.println("ENTER FILLED: ");
		boolean filled=Boolean.parseBoolean(bf.readLine());
		switch(choice){
		
		case 1: System.out.println("ENTER RADIUS: ");
		double radius=Double.parseDouble(bf.readLine());
		Circle c=new Circle(color,filled,radius);
		System.out.println("AREA OF CIRCLE:"+c.area());
		break;
		
		case 2: System.out.println("ENTER BASE: ");
		double base=Double.parseDouble(bf.readLine());
		System.out.println("ENTER HEIGHT: ");
		double height=Double.parseDouble(bf.readLine());
		Triangle t=new Triangle(color,filled,base,height);
		System.out.println("AREA OF TRIANGLE:"+t.area());
		break; 
		
		case 3: System.out.println("ENTER LENGTH: ");
		double length=Double.parseDouble(bf.readLine());
		System.out.println("ENTER BREADTH: ");
		double breadth=Double.parseDouble(bf.readLine());
		Rectangle r=new Rectangle(color,filled,length,breadth);
		System.out.println("AREA OF RECTANGLE:"+r.area());
		break;
		
		case 4: System.out.println("ENTER HEIGHT: ");
		double h=Double.parseDouble(bf.readLine());
		System.out.println("ENTER RADIUS: ");
		double rad=Double.parseDouble(bf.readLine());
		Cylinder cy=new Cylinder(color,filled,rad,h);
		System.out.println("AREA OF CYLINDER:"+cy.area());
		break;
		}
	

	}

}

