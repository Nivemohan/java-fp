import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class MaximumNoOcc
{
	public static void main(String args[])throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int value[];
		value=new int[5];
		System.out.println("Enter the values:");
		for(int iterator=0;iterator<value.length;iterator++)
		{
			value[iterator]=Integer.parseInt(bf.readLine());
		}
		int maximumNo=value[0];
		for(int i=1;i<value.length;i++)
		{
		if(value[i]>maximumNo)
		{
			maximumNo=value[i];
		}
    	}
		System.out.println("THE MAXIMUM NO IS "+maximumNo);
		int count=0;
		for(int iterator=0;iterator<value.length;iterator++)
		{
			if(maximumNo==value[iterator])
			{
				count++;
			}
		}
		System.out.println("THE OCCURENCE IS "+count);

		
	}
}
