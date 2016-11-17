QUESTION-1
SOLUTION CLASS:

package org.opt;
import num.dot.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution{
	public static void main(String args[])throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.MODIFY USING OBJECT\n2.MODIFY USING ARGUMENTS\n3.DISTANCE BETWEEN AXIS\n4.DISTANCE BETWEEN AXIS AND POINT\n5.DISTANCE BETWEEN TWO POINTS\n6.DISTANCE USING OBJECTS");
		System.out.print("ENTER THE CHOICE:");
		int choice=Integer.parseInt(bf.readLine());
		System.out.println("ENTER THE POINTS:");
		int x=Integer.parseInt(bf.readLine());
		int y=Integer.parseInt(bf.readLine());
		Point pt=new Point();
		switch(choice){
			case 1:	Point pt1=new Point(x,y);
					pt.setXY(pt1);
					System.out.println(pt);
					break;
			case 2: pt.setXY(x,y);
					System.out.println(pt);
					break;
			case 3:	pt.setXY(x,y);
					System.out.println(pt);
					System.out.printf(String.format("Distance is :%.2f",pt.distance()));
					break;
			case 4:	pt=new Point(x);
					System.out.println("Enter axis:");
					int axis=Integer.parseInt(bf.readLine());
					System.out.println(pt);
					System.out.println("(axis,axis) : " +axis +","+axis);
					System.out.printf(String.format("DISTANCE IS:%.2f",pt.distance(axis)));
					break;

			case 5:	pt=new Point(x,y);
					System.out.println("Enter points:");
					int x1=Integer.parseInt(bf.readLine());
					int y1=Integer.parseInt(bf.readLine());
					System.out.println(pt);
					System.out.println("(x1,y1) : " + x1 +","+ y1);
					System.out.printf(String.format("Distance is:%.2f",pt.distance(x1,y1)));
					break;

			case 6:	pt=new Point(x,y);
					System.out.println("Enter points:");
				    x1=Integer.parseInt(bf.readLine());
					y1=Integer.parseInt(bf.readLine());
					Point pt2=new Point(x1,y1);
					System.out.println(pt);
					System.out.println("(x1,y1) : " + x1 +","+ y1);
					System.out.printf(String.format("Distance is :%.2f",pt.distance(pt2)));
					break;


		}
		}
}

POINT CLASS:

package num.dot;
public class Point{
	int x,y;
	public String toString(){
		return "(x,y):"+x+","+y;
	}
	public Point(){
		x=0;
		y=0;
	}
	public void setXY(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setXY(Point another){
		this.x=another.x;
		this.y=another.y;
	}
	public Point(int axis){
		this.x=axis;
	}
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public double distance(){
		int distance=((x*x)+(y*y));
		return Math.sqrt(distance);

	}
	public double distance(int axis){
		int distance=((x-axis)*(x-axis))+((y-axis)*(y-axis));
		return Math.sqrt(distance);

	}
	public double distance(int x1,int y1){
		int distance=((x1-x)*(x1-x))+((y1-y)*(y1-y));
		return Math.sqrt(distance);

	}
	public double distance(Point another){
		int distance=((another.x-x)*(another.x-x))+((another.y-y)*(another.y-y));
		return Math.sqrt(distance);

	}
	void print(){
		System.out.println();
	}
}








QUESTION-2
COMPLEX CLASS:
package num.cmx;
public class Complex
{
int real1,imaginary1,answerReal,answerImaginary,real2,imaginary2;
public Complex()
{
	real1=0;
    imaginary1=0;
}
public Complex(int real1,int imaginary1)
{
	this.real1=real1;
	this.imaginary1=imaginary1;
}
public String toString() {
	return real1 + "+" + imaginary1 + "j";
}
public void set(int real1,int imaginary1)
{
	this.real1=real1;
	this.imaginary1=imaginary1;
}
public boolean isReal() 
{
	if(real1!=0)
	return true;
	else
	return false;
}
public boolean isImaginary() 
{
	if(imaginary1!=0)
	return true;
	else
	return false;
}
public Complex add(int real2,int imaginary2)
{
	Complex output;
	System.out.print("ADDITION:");
	answerReal=this.real1+real2;
	answerImaginary=this.imaginary1+imaginary2;
	output = new Complex(answerReal,answerImaginary);
	return output;
}
public Complex subtract(int real2,int imaginary2)
{
	Complex output;
	System.out.print("SUBTRACTION:");
	answerReal=this.real1-real2;
	answerImaginary=this.imaginary1-imaginary2;
	output = new Complex(answerReal,answerImaginary);
	return output;
}
public Complex multiply(int real2,int imaginary2)
{
	Complex output;
	System.out.print("MULTIPLICATION:");
	answerReal=(this.real1*real2)-(this.imaginary1*imaginary2);
	answerImaginary=(this.imaginary1*real2)+(this.real1*imaginary2);
	output = new Complex(answerReal,answerImaginary);
	return output;
}
public Complex divide(int real2,int maginary2)
{
	Complex output;
	System.out.print("DIVISION:");
	answerReal=(this.real1/real2)-(this.imaginary1/imaginary2);
    answerImaginary=(this.real1/imaginary2)+(this.imaginary1/real2);
    output=new Complex(answerReal,answerImaginary);
	return output;
}
public Complex add(Complex another) 
{
	Complex output;
	answerReal=this.real1+another.real1;
	answerImaginary=this.imaginary1+another.imaginary1;
	output=new Complex(answerReal,answerImaginary);
	return output;
}
public Complex subtract(Complex another) 
{
	Complex output;
	answerReal=this.real1+another.real1;
	answerImaginary=this.imaginary1+another.imaginary1;
	output=new Complex(answerReal,answerImaginary);
	return output;
}
public Complex multiply(Complex another) 
{
	Complex output;
	answerReal=this.real1+another.real1;
	answerImaginary=this.imaginary1+another.imaginary1;
	output=new Complex(answerReal,answerImaginary);
	return output;
}
public Complex divide(Complex another) 
{
	Complex output;
	answerReal=this.real1+another.real1;
	answerImaginary=this.imaginary1+another.imaginary1;
	output=new Complex(answerReal,answerImaginary);
	return output;
}
}




SOLUTION CLASS:
package org.main;
import num.cmx.Complex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution{
	public static void main(String a[])throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
 		Complex cmp1=new Complex();
		System.out.println(("\n1.Add\n2.Subtract\n3.Multiplty with\n4.Divided by\n5.Add using object\n6.Subtract using object\n7.Multiplty using object\n8.Divide using object");
		System.out.println("ENTER THE CHOICE\n");
 		int choice=Integer.parseInt(bf.readLine());
 		System.out.println("ENTER THE REAL AND IMAGINARY FOR FIRST VALUE:");
 		int real1=Integer.parseInt(bf.readLine());
 		int imaginary1=Integer.parseInt(bf.readLine());
 		cmp1=new Complex(real1,imaginary1);
 		cmp1.set(real1,imaginary1);
 		System.out.println("ENTER THE REAL AND IMAGINARY FOR SECOND VALUE:");
 		int real2=Integer.parseInt(bf.readLine());
 		int imaginary2=Integer.parseInt(bf.readLine());
 		switch(choice){
 			    case 1:	Complex cmp2=cmp1.add(real2,imaginary2);
						System.out.println(cmp2);
    					break;
    			case 2:	Complex cmp3=cmp1.subtract(real2,imaginary2);
    					System.out.println(cmp3);
    					break;
    			case 3:	Complex cmp4=cmp1.multiply(real2,imaginary2);
    					System.out.println(cmp4);
    					break;
    			case 4:	Complex cmp5=cmp1.divide(real2,imaginary2);
    					System.out.println(cmp5);
   						break;
    			case 5:	Complex cmp6=new Complex(real2,imaginary2);
    					Complex cmp7=cmp1.add(cmp6);
    					System.out.println(cmp7);
    					break;
    			case 6:	Complex cmp8=new Complex(real2,imaginary2);
    					Complex cmp9=cmp1.subtract(cmp8);
    					System.out.println(cmp8);
    					break;
    			case 7:	Complex cmp10=new Complex(real2,imaginary2);
    					Complex cmp11=cmp1.multiply(cmp10);
    					System.out.println(cmp11);
    					break;
    			case 8:	Complex cmp12=new Complex(real2,imaginary2);
    					Complex cmp13=cmp1.divide(cmp12);
    					System.out.println(cmp13);
    					break;
  }
 }
}



