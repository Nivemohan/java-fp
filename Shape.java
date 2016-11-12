class Circle
{
	double radius;
	static double pi=3.14;
	void area()
	{
		System.out.println("THE AREA OF CIRCLE IS "+(pi*radius*radius));
	}
}

class Rectangle
{
	double length,breadth;
	void area()
	{
		System.out.println("THE AREA OF RECTANGLE IS "+(length*breadth));
	}
}

class Triangle
{
	double base,height;
	void area()
	{
		System.out.println("THE AREA OF TRIANGLE IS "+((0.5)*base*height));
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution
{
	public static void main(String args[])throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.CIRCLE 2.RECTANGLE 3.TRIANGLE");
		System.out.print("ENTER THE CHOICE:");
		System.out.print("\n");
		int choice=Integer.parseInt(bf.readLine());
		switch(choice)
		{
			case 1:System.out.println(".....CIRCLE.....");
			System.out.println("ENTER THE RADIUS");
			Circle cObject=new Circle();
            cObject.radius=Double.parseDouble(bf.readLine());
            cObject.area();
            break;

            case 2:System.out.println(".....RECTANGLE.....");
			Rectangle rObject=new Rectangle();
			System.out.println("ENTER LENGTH");
            rObject.length=Double.parseDouble(bf.readLine());
            System.out.println("ENTER BREADTH");
            rObject.breadth=Double.parseDouble(bf.readLine());
            rObject.area();
            break;

            case 3:System.out.println(".....TRIANGLE.....");
			Triangle tObject=new Triangle();
			System.out.println("ENTER BASE");
            tObject.base=Double.parseDouble(bf.readLine());
            System.out.println("ENTER HEIGHT");
            tObject.height=Double.parseDouble(bf.readLine());
            tObject.area();
            break;

		}
		
		
		
	}
}
