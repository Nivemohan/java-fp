import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Counter
{
	public static void main(String args[])throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int counter[][][];
        int year=2015;
		counter=new int[12][][];
		int monthDays[]={31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			monthDays[1]=29;
		}
		else
		{
			monthDays[1]=28;
		}
		for(int iterator=0;iterator<monthDays.length;iterator++)
		{
			counter[iterator]=new int[monthDays[iterator]][24];
		}
		
		System.out.print("Enter the input: ");
		System.out.print("\n");
		for(int mIterator=0;mIterator<12;mIterator++)
		{
				for(int dIterator=0;dIterator<monthDays[mIterator];dIterator++)
				{
					String input=bf.readLine();
					String cInput[]=input.split(" ");
                    for(int hIterator=0;hIterator<24;hIterator++)
                    {
                    	counter[mIterator][dIterator][hIterator]=Integer.parseInt(cInput[hIterator]);
                    }
				}
		}
     
		int januarySum=0;
		System.out.print("Average number of customers on january month: ");
		for(int dIterator=0;dIterator<12;dIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				januarySum=januarySum+counter[0][dIterator][hIterator];
			}
		}
		System.out.println(januarySum/(12*24));
		System.out.print("\n");

		int decemberSum=0;
		System.out.print("Average number of customers on december 21: ");
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				decemberSum=decemberSum+counter[11][21][hIterator];
			}
		System.out.println(decemberSum/24);
		System.out.print("\n");

		int month7Sum=0;
		System.out.print("Average number of customers on every month day 7: ");
		for(int mIterator=0;mIterator<12;mIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				month7Sum=month7Sum+counter[mIterator][7][hIterator];
			}
		}
		System.out.println(month7Sum/(12*24));
		System.out.print("\n");

		int day29Sum=0;
		System.out.print("Average number of customers on every month day 29: ");
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
		for(int mIterator=0;mIterator<12;mIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				day29Sum=month7Sum+counter[mIterator][28][hIterator];
			}
		}
		System.out.println(day29Sum/(12*24));
		System.out.print("\n");

	    }
	    else
	    {
	    	for(int mIterator=0;(mIterator!=1)&&(mIterator<12);mIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				day29Sum=month7Sum+counter[mIterator][28][hIterator];
			}
		}
		System.out.println(day29Sum/(11*24));
		System.out.print("\n");


	    }
		
		 int hourSum=0;
		for(int mIterator=0;mIterator<12;mIterator++)
		{
		for(int dIterator=0;dIterator<24;dIterator++)
		{
			for(int hIterator=9;hIterator<18;hIterator++)
			{
				hourSum=hourSum+counter[mIterator][dIterator][hIterator];
			}
		}
	    }
		System.out.print("Average number of customers on every day of hour 10 to 18: "+hourSum/(12*9));
		System.out.print("\n");

		int dayHourSum=0;
		for(int mIterator=0;mIterator<12;mIterator++)
		{
			for(int hIterator=7;hIterator<12;hIterator++)
			{
				dayHourSum=dayHourSum+counter[mIterator][5][hIterator];
				dayHourSum=dayHourSum+counter[mIterator][7][hIterator];
				dayHourSum=dayHourSum+counter[mIterator][12][hIterator];
				dayHourSum=dayHourSum+counter[mIterator][16][hIterator];
				dayHourSum=dayHourSum+counter[mIterator][23][hIterator];
			}
			for(int hIterator=15;hIterator<24;hIterator++)
			{
				dayHourSum=dayHourSum+counter[mIterator][5][hIterator];
				dayHourSum=dayHourSum+counter[mIterator][7][hIterator];
				dayHourSum=dayHourSum+counter[mIterator][12][hIterator];
				dayHourSum=dayHourSum+counter[mIterator][16][hIterator];
				dayHourSum=dayHourSum+counter[mIterator][23][hIterator];
			}
		}
			System.out.print("Average number of customers on each day of hour 8 to 12 and 16 to 24: "+dayHourSum/(5*4));
			System.out.print("\n");
		


		int julySum=0;
		System.out.print("Total and Average number of customers on each day july month: ");
		for(int dIterator=0;dIterator<12;dIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				julySum=julySum+counter[6][dIterator][hIterator];
			}
		}
		System.out.println(julySum+" "+julySum/(12*24));
		System.out.print("\n");
		
		int yearSum=0,yearAverage=0;
		for(int mIterator=0;mIterator<12;mIterator++)
		{
			int eachMonthSum=0,eachMonthAverage=0;
		for(int dIterator=0;dIterator<monthDays[mIterator];dIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				eachMonthSum=eachMonthSum+counter[mIterator][dIterator][hIterator];
			}
		}
		eachMonthAverage=eachMonthSum/(24*monthDays[mIterator]);
		System.out.print("Total and Average number of customers on month "+mIterator+": "+eachMonthSum+" "+eachMonthAverage);
		System.out.print("\n");
		yearSum=yearSum+eachMonthSum;
	    }
	    yearAverage=yearSum/12;
		System.out.print("Total and Average number of customers of the year:"+yearSum+" "+yearAverage);
System.out.print("\n");
}
}
	

