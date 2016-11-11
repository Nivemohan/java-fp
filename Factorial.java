import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Factorial
{
	public static void main(String args[])throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER A VALUE ");
		int value=Integer.parseInt(bf.readLine());
		int fact=1,iterator=1;
		while(iterator<=value)
		{
			fact=fact*iterator;
			iterator++;
		}
		System.out.println("THE FACTORAIL OF GIVEN NUMBER IS "+fact);
	}
}
