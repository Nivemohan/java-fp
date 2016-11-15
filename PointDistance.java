POINT CLASS:


public class Point{
	int x,y;
	public String toString(){
		return "("+x+","+y+")";
	}
	public Point(){
		x=0;
		y=0;
	}
	public void setXY(int x,int y){
		this.x=x;
		this.y=y;
	}
	public Point(int axis){
		this.x=axis;
		this.y=axis;
	}
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public double distance(){
		int distance=((this.x*this.x)+(this.y*this.y));
		return Math.sqrt(distance);

	}
	public double distance(int axis){
		int distance=((axis-this.x)*(axis-this.x))+((axis-this.y)*(axis-this.y));
		return Math.sqrt(distance);

	}
	public double distance(int x1,int y1){
		int distance=((x1-this.x)*(x1-this.x))+((y1-this.y)*(y1-this.y));
		return Math.sqrt(distance);

	}


}
SOLUTION CLASS:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution{
	public static void main(String args[])throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE POINTS:");
		int x=Integer.parseInt(bf.readLine());
		int y=Integer.parseInt(bf.readLine());
		System.out.println("1.DISTANCE BETWEEN AXIS\n2.DISTANCE BETWEEN AXIS AND POINT\n3.DISTANCE BETWEEN TWO POINTS");
		System.out.print("ENTER THE CHOICE:");
		int choice=Integer.parseInt(bf.readLine());
		Point pt=new Point();
		switch(choice){
			case 1:	pt=new Point(x,y);
					pt.setXY(x,y);
					System.out.println("Distance is:"+pt.distance());
					break;
			case 2:	pt=new Point(x);
					pt.setXY(x,y);
					System.out.println("Enter axis:");
				   	int axis=Integer.parseInt(bf.readLine());
				   	System.out.println("Distance is:"+pt.distance(axis));
					break;
			case 3:	pt=new Point(x,y);
					pt.setXY(x,y);
					System.out.println("Enter points:");
					int x1=Integer.parseInt(bf.readLine());
					int y1=Integer.parseInt(bf.readLine());
					System.out.println("Distance is:"+pt.distance(x,y));
					break;
		}
		System.out.println(pt);
	}
}
