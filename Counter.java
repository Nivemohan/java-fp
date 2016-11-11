import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ArrayTask
{
	public static void main(String args[])throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int counter[][][],year=2015;
		counter=new int[12][][];
		int monthDays[]={31,28,31,30,31,30,31,31,30,31,30,31};
		for(int iterator=0;iterator<monthDays.length;iterator++)
		{
			counter[iterator]=new int[monthDays[iterator]][24];
		}
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			monthDays[1]=29;
		}
		else
		{
			monthDays[1]=28;
		}
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
       /* for(int mIterator=0;mIterator<12;mIterator++)
		{
				for(int dIterator=0;dIterator<monthDays[mIterator];dIterator++)
				{
                    for(int hIterator=0;hIterator<24;hIterator++)
                    {
                    	System.out.println(counter[mIterator][dIterator][hIterator]);
                    }
				}
		}*/
		int jsum=0;
		System.out.println("Average number of customers on january month: ");
		for(int dIterator=0;dIterator<12;dIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				jsum=jsum+counter[0][dIterator][hIterator];
			}
		}
		System.out.println(jsum/(12*24));

		int dsum=0;
		System.out.println("Average number of customers on december 21: ");
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				dsum=dsum+counter[11][21][hIterator];
			}
		System.out.println(dsum/24);

		int esum=0;
		System.out.println("Average number of customers on every month day 7: ");
		for(int mIterator=0;mIterator<12;mIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				esum=esum+counter[mIterator][7][hIterator];
			}
		}
		System.out.println(esum/(12*24));

		int ejsum=0;
		System.out.println("Total and Average number of customers on each day july month: ");
		for(int dIterator=0;dIterator<12;dIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				ejsum=ejsum+counter[6][dIterator][hIterator];
			}
		}
		System.out.println(ejsum+"and "+ejsum/(12*24));
		
		
		int yrsum=0;
		for(int mIterator=0;mIterator<12;mIterator++)
		{
			int emsum=0,emaverage=0;
		for(int dIterator=0;dIterator<monthDays[mIterator];dIterator++)
		{
			for(int hIterator=0;hIterator<24;hIterator++)
			{
				emsum=emsum+counter[mIterator][dIterator][hIterator];
			}
		}
		emaverage=emsum/(24*monthDays[mIterator]);
		System.out.println("Total and Average number of customers on each month: "+emsum+"and"+emaverage);
		yrsum=yrsum+emsum;
	    }
		System.out.println("Total and Average number of customers of the year:"+yrsum);

         int hsum=0;
		for(int mIterator=0;mIterator<12;mIterator++)
		{
		for(int dIterator=0;dIterator<24;dIterator++)
		{
			for(int hIterator=9;hIterator<18;hIterator++)
			{
				hsum=hsum+counter[mIterator][dIterator][hIterator];
			}
		}
	    }
		System.out.println("Average number of customers on every day of hour 10 to 18: "+hsum/(12*9));

		int hmsum=0;
		for(int mIterator=0;mIterator<12;mIterator++)
		{
			for(int hIterator=7;hIterator<12;hIterator++)
			{
				hmsum=hmsum+counter[mIterator][5][hIterator];
				hmsum=hmsum+counter[mIterator][7][hIterator];
				hmsum=hmsum+counter[mIterator][12][hIterator];
				hmsum=hmsum+counter[mIterator][16][hIterator];
				hmsum=hmsum+counter[mIterator][23][hIterator];
			}
			for(int hIterator=15;hIterator<24;hIterator++)
			{
				hmsum=hmsum+counter[mIterator][5][hIterator];
				hmsum=hmsum+counter[mIterator][7][hIterator];
				hmsum=hmsum+counter[mIterator][12][hIterator];
				hmsum=hmsum+counter[mIterator][16][hIterator];
				hmsum=hmsum+counter[mIterator][23][hIterator];
			}
		}
			System.out.println("Average number of customers on each day of hour 8 to 12 and 16 to 24: "+hmsum/(5*4));
		
	    
	}
}
	
