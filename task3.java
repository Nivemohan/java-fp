import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution{
	public static void main(String args[]){
		BufferedReader bf=new BufferedReader(InputStreamReader(System.in));
		System.out.println("1.SHOW COMPLEX NUMBER   2.ADD  3.SUBTRACT  4.MULTIPLY WITH  5.DIVIDE BY  6.IS REAL  7.IS IMAGINARY");
		System.out.print("ENTER THE CHOICE:");
		int choice=Integer.parseInt(bf.readLine);
		int real=Integer.parseInt(bf.readLine);
		int imaginary=Integer.parseInt(bf.readLine);
        Solution sObj=new Solution();
		switch(choice){
			case 1:sObj.isReal();
			break;
			case 2:sObj.isImaginary();
			break;
			case 1:sObj.add();
			break;
			case 1:sObj.subtract();
			break;
			case 1:sObj.multiplyWith();
			break;
			case 1:sObj.divideBy();
			break;
			case 1:sObj.show();
			break;
		}
	}
}
