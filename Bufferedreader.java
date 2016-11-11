import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Bufferedreader
{
	public static void main(String args[])throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int value=Integer.parseInt(bf.readLine());
		String values=bf.readLine();
		System.out.println(value);
		System.out.println(values);
	}
}
