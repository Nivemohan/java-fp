import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Average
{
	public static void main(String args[])throws IOException
	{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	int value[],sum=0;
	value=new int[5];
	System.out.println("ENTER THE VALUES: ");
	for(int iterator=0;iterator<value.length;iterator++)
	{
		value[iterator]=Integer.parseInt(bf.readLine());
		sum=sum+value[iterator];
	}
	int average=sum/value.length;
	System.out.println("THE AVERAGE OF GIVEN NUMBERS IS "+average);
}
}
