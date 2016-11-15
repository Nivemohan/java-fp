import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Solution{

public static void main(String args[])throws IOException{

BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

System.out.println("1.ADD 2.SUBTRACT 3.MULTIPLY WITH 4.DIVIDE BY 5.IS

REAL 6.IS IMAGINARY");

System.out.print("ENTER THE CHOICE:");

int choice=Integer.parseInt(bf.readLine());

System.out.println("ENTER THE FIRST REAL AND IMAGINARY NUMBER: ");

int real=Integer.parseInt(bf.readLine());

int imaginary=Integer.parseInt(bf.readLine());

Complex sObj=new Complex();

System.out.println("ENTER THE SECOND REAL AND IMAGINARY NUMBER: ");

sObj.real1=Integer.parseInt(bf.readLine());

sObj.imaginary1=Integer.parseInt(bf.readLine());

switch(choice){

case 1:sObj.add(real,imaginary);

break;

case 2:sObj.subtract(real,imaginary);

break;

case 3:sObj.multiplyWith(real,imaginary);

break;

case 4:sObj.divideBy(real,imaginary);

break;

}

}

}

COMPLEX CLASS:

public class Complex{

int realOutput,imaginaryOutput;

int real1;

int imaginary1;

void add(int real,int imaginary)

{

realOutput=real+real1;

imaginaryOutput=imaginary+imaginary1;

print();

}

void subtract(int real,int imaginary)

{

if (real<real1) {

realOutput=real1-real;

imaginaryOutput=imaginary1-imaginary;

print();

}

else

{

realOutput=real-real1;

imaginaryOutput=imaginary-imaginary1;

print();

}

}

void multiplyWith(int real,int imaginary)

{

realOutput=(real*real1)-(imaginary*imaginary1);

imaginaryOutput=(imaginary*real1)+(real*imaginary1);

print();

}

void divideBy(int real,int imaginary)

{

int numReal=(real*real1)-(imaginary*((-1)*imaginary1));

int numImaginary=(imaginary1*imaginary)+(real*((-1)*imaginary1));

int denReal=(real1*real1)-(imaginary1*((-1)*imaginary1));

int denImaginary=(real1*imaginary1)+(real1*((-1)*imaginary1));

System.out.println("DIVISION:"+numReal+"+"+numImaginary+"i"+"/"+denReal+"+"+denImaginary+"i

");

}

void print()

{

System.out.println("OUTPUT:"+realOutput+"+"+imaginaryOutput+"i");

}

}
