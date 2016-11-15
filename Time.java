SOLUTION CLASS

package main;
import pack.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Next Hour\t2.Next Minute\t3.Next Second");
		System.out.println("4.Previous Hour\t5.Previous Minute\t6.Previous Second");
		int choice = Integer.parseInt(bf.readLine());
		System.out.print("Enter the hour");
		int hour = Integer.parseInt(bf.readLine());
		System.out.print("Enter the minute");
		int minute = Integer.parseInt(bf.readLine());
		System.out.print("Enter the second");
		int second = Integer.parseInt(bf.readLine());
		Time time = new Time(hour,minute,second);
		switch(choice) {
			case 1:
			time.nextHour();
			break;
			case 2:
			time.nextMinute();
			break;
			case 3:
			time.nextSecond();
			break;
			case 4:
			time.previousHour();
			break;
			case 5:
			time.previousMinute();
			break;
			case 6:
			time.previousSecond();
			break;
		}	
	}
}

TIME CLASS

package pack;
public class Time {
	int hour;
	int minute;
	int second;
	Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	Time(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	void nextHour() {
		hour = hour+1;
		if(hour == 24)
			hour = 0;
		print();
	}
	void nextMinute() {
		minute = minute+1;
		if(minute == 60) {
			minute = 0;
			hour = hour+1;
			if(hour == 24)
				hour = 0;
		}
		print();
	}
	void nextSecond() {
		second = second+1;
		if(second == 60){
			second = 0;
			minute = minute+1;
			if(minute == 60) {
				minute = 0;
				hour = hour+1;
				if(hour == 24)
					hour = 0;
			}
		}
		print();
	}
	void previousHour() {
		if(hour == 0)
			hour = 23;
		else
			hour = hour-1;
		print();
	}
	void previousMinute() {
		if(minute == 0) {
			minute = 59;
			if(hour == 0)
				hour = 23;
			else
				hour = hour-1;
		}
		else
			minute = minute-1;
		print();
	}
	void previousSecond() {
		if(second == 0){
			second = 59;
			if(minute == 0) {
				minute = 59;
				if(hour == 0)
					hour = 23;
				else
					hour = hour-1;
			}
			else 
				minute = minute-1;
		}
		else 
			second = second-1;
		print();
	}
	void print() {
			System.out.print(String.format("%02d",hour)+":");
			System.out.print(String.format("%02d",minute)+":");
			System.out.print(String.format("%02d",second));
	}
}


