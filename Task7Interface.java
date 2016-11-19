Question-1:

SHAPE CLASS:
package shape;

public abstract class Shape {
	String color;
	boolean filled;
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
	public Shape() {
		super();
		this.color = "";
		this.filled = false;
	}
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
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
	
	}

CIRCLE CLASS:

package circle;

import shape.Shape;

public class Circle extends Shape{
	protected double radius;

	public Circle() {
		super();
		this.radius = 0.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return this.radius * this.radius * 3.14;
	}
	public double getPerimeter(){
		return 2 * 3.14 * this.radius;
	}
	public String toString(){
		return "AREA OF CIRCLE " + this.getArea()+"\nPERIMETER OF CIRCLE " + this.getPerimeter();
		
	}
	
}

RECTANGLE CLASS:

package rectangle;

import shape.Shape;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	public Rectangle() {
		super();
		this.width = 0.0;
		this.length = 0.0;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	public double getArea(){
		return this.length * this.width;
	}
	public double getPerimeter(){
		return 2 * this.length + this.width;
	}
	public String toString(){
		return "AREA OF RECTANGLE " + this.getArea()+"\nPERIMETER OF RECTANGLE " + this.getPerimeter();
		
	}
	

}

SQUARE CLASS:

package square;

import rectangle.Rectangle;

public class Square extends Rectangle {
	protected double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square() {
		super();
		this.side = 0.0;
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side ,side);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String toString(){
		return "AREA OF RECTANGLE " + this.getArea()+"\nPERIMETER OF RECTANGLE " + this.getPerimeter();
		
	}
}

SOLUTION CLASS:

package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import rectangle.Rectangle;
import square.Square;
import circle.Circle;

public class Solution {

	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(".............AREA AND PERIMETER CALCULATION.........");
	System.out.println("1.CIRCLE\n2.RECTANGLLE\n3.SQUARE");
	System.out.println("ENTER YOUR CHOICE:");
	int choice=Integer.parseInt(bf.readLine());
	System.out.println("ENTER COLOR:");
	String color=bf.readLine();
	System.out.println("ENTER FILLED:");
	boolean filled=Boolean.parseBoolean(bf.readLine());
	switch(choice) {
	
	case 1:	System.out.println("ENTER RADIUS:");
	double radius=Double.parseDouble(bf.readLine());
	Circle circle=new Circle(radius);
	circle.getArea();
	circle.getPerimeter();
	System.out.println(circle);
	break;
	
	case 2:	System.out.println("ENTER LENGTH:");
	double length=Double.parseDouble(bf.readLine());
	System.out.println("ENTER WIDTH:");
	double width=Double.parseDouble(bf.readLine());
	Rectangle rectangle=new Rectangle(length,width);
	rectangle.getArea();
	rectangle.getPerimeter();
	System.out.println(rectangle);
	break;
	
	case 3:	System.out.println("ENTER SIDE:");
	double side=Double.parseDouble(bf.readLine());
	Square square=new Square(color, filled, side);
	square.getArea();
	square.getPerimeter();
	System.out.println(square);
	break;
	}
	}
}

 







Question-2

MOVABLE CLASS:

package movable;

public interface Movable {
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();

}

MOVABLE POINT CLASS:

package movablepoint;

public class MovablePoint {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public String toString(){
		return "(" + this.x + "," + this.y + ")";
	}
	public void moveUp(){
		this.y +=this.ySpeed;
		
	}
	public void moveDown(){
		
		this.y -=this.ySpeed;
	}
	public void moveRight(){
		this.x +=this.xSpeed;
	}
	public void moveLeft(){
		this.x -=this.xSpeed;
	}

}



SOLUTION CLASS:

package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import movablepoint.MovablePoint;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.MOVE UP\n 2.MOVE DOWN\n 3.MOVE LEFT\n 4.MOVE RIGHT");
		System.out.println("ENTER YOUR CHOICE:");
		int choice=Integer.parseInt(bf.readLine());
		System.out.println("ENTER x:");
		int x=Integer.parseInt(bf.readLine());
		System.out.println("ENTER y:");
		int y=Integer.parseInt(bf.readLine());
		System.out.println("ENTER xSpeed:");
		int xSpeed=Integer.parseInt(bf.readLine());
		System.out.println("ENTER ySpeed:");
		int ySpeed=Integer.parseInt(bf.readLine());
		MovablePoint mp=new MovablePoint(x,y,xSpeed,ySpeed);
		switch(choice){
		case 1: mp.moveUp();
		System.out.println(mp);
		break;
		case 2: mp.moveDown();
		System.out.println(mp);
		break;
		case 3: mp.moveLeft();
		System.out.println(mp);
		break;
		case 4: mp.moveRight();
		System.out.println(mp);
		break;
		}

	}
}
 


Question-3:

MYDATE CLASS:

package org.time;

import java.util.Calendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private static String strMonths[]={"Jan", "Feb", "Mar", "Apr" ,"May", "Jun" ,"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private static String strDays[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
	private static int daysInMonths[]={31,28,31,30,31,30,31,31,30,31,30,31};
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public static boolean isLeapYear(int year){
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			return true;
		}
			else {
				return false;
			}
		}
		
	public static boolean isValidDate(int year, int month, int day){
		if(month > 12)
			return false;
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
			daysInMonths[1] = 29;
		if(day == daysInMonths[month - 1]) 
			return false;
		else
			return true;

		
	}
	public static int getDayOfWeek(int year, int month, int day){
		Calendar calendar = Calendar.getInstance();
	     calendar.set(year, month, day) ;
	     int week=calendar.get(Calendar.DAY_OF_WEEK);
	     return week;

	}
	public void setDate(int year, int month, int day){
		this.day = day;
		this.month = month;
		this.year = year;

		
	}
	public MyDate nextDay(){
		MyDate date;
		if(((this.year%4==0)&&(this.year%100!=0))||(this.year%400==0))
			daysInMonths[1] = 29;
		if(this.day == daysInMonths[this.month - 1]) {
			this.day = 1;
			if(this.month == 12) {
				this.month = 1;
				this.year = this.year +1;
			}
			else 
				this.month += 1;
		}
		else
			this.day += 1;	
		date = new MyDate(this.day,this.month,this.year);
		return date;
		}
	public MyDate nextMonth(){
		MyDate date;
		if(this.month == 12) {
			this.month = 1;
			this.year += 1;
		}
		else
			this.month += 1;
		date = new MyDate(this.day,this.month,this.year);
		return date;
		}
	public MyDate nextYear(){
		MyDate date;
		this.year += 1;
		date = new MyDate(this.day,this.month,this.year);
		return date;
		}
	public MyDate previousDay(){
		MyDate date;
		if(((this.year%4==0)&&(this.year%100!=0))||(this.year%400==0))
			daysInMonths[1] = 29;
		if(this.day == 1) {
			if(this.month == 1) {
				this.month = 12;
				this.year = this.year - 1;
			}
			else 
				this.month -= 1;
			this.day = daysInMonths[this.month - 1];
		}
		else
			this.day -= 1;	
		date = new MyDate(this.day,this.month,this.year);
		return date;
		}
	public MyDate previousMonth(){
		MyDate date;
		if(this.month == 1) {
			this.month = 12;
			this.year -= 1;
		}
		else
			this.month -= 1;
		date = new MyDate(this.day,this.month,this.year);
		return date;
		}
	public MyDate previousYear(){
		MyDate date;
		this.year -= 1;
		date = new MyDate(this.day,this.month,this.year);
		return date;
		}
	public String toString(){
		String monthM =String.format("%02d",this.month);
		String dayD = String.format("%02d",this.day);
		return "Date " + dayD + "-" + monthM + "-" + this.year;	
		}

	}

SOLUTION CLASS:

package org.main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.time.MyDate;


public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Is Leap Year\n2.Is Valid Date\n3.Next Day\n4.Next Month\n5.Next Year\n6.Previous Day\n7.Previous Month\n8.Previous year");
		System.out.println("Enter Your Choice:");
		int choice=Integer.parseInt(bf.readLine());
		System.out.println("Enter the date in the format yyyy-mm-dd");
		String str = bf.readLine();
		String date[] = str.split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		int day = Integer.parseInt(date[2]);
		MyDate mdate = new MyDate(year,month,day);
		switch(choice){
		case 1:
			System.out.println(mdate.isLeapYear(year)); 
			break;
		case 2:
			System.out.println(mdate.isValidDate(year,month,day));
			break;
		case 3:
			MyDate mdate1 = mdate.nextDay();
			System.out.println(mdate1);
			break;
		case 4:
			MyDate mdate2 = mdate.nextMonth();
			System.out.println(mdate2);
			break;	
		case 5:
			MyDate mdate3 = mdate.nextYear();
			System.out.println(mdate3);
			break;
		case 6:
			MyDate mdate4 = mdate.previousDay();
			System.out.println(mdate4);
			break;
		case 7:
			MyDate mdate5 = mdate.previousMonth();
			System.out.println(mdate5);
			break;	
		case 8:
			MyDate mdate6 = mdate.previousYear();
			System.out.println(mdate6);
			break;
		case 9:
			System.out.println(mdate.getDayOfWeek(year,month,day)); 
			break;
			

		}
	}

}
 


