public class Transpose
{
	public static void main(String args[])
	{
		int values[][];
		values=new int[3][3];
		int index=0;
		System.out.println("The matrix  ");
        for(int rIterator=0;rIterator<values.length;rIterator++)
        {
        	for(int cIterator=0;cIterator<values[rIterator].length;cIterator++)
        	{
        		values[rIterator][cIterator]=Integer.parseInt(args[index]);
        		System.out.print(values[rIterator][cIterator]+" ");
        		index++;
        		
        	}
        	System.out.print("\n");
        } 
        System.out.println("Transpose of matrix  ");
        for(int rIterator=0;rIterator<values.length;rIterator++)
        {
        	for(int cIterator=0;cIterator<values[0].length;cIterator++)
        	{
        	 System.out.print(values[cIterator][rIterator]+" ");
        	}
        		System.out.print("\n");
        } 
	}
}
