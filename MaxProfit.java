import java.util.Scanner;
import java.util.Vector;


public class MaxProfit 
{
	
	static int getMaxProfit(int array[])
	{
		int indexofmin=0;
		int indexofmax=0;
		int min=array[0];
		int max=array[0];
		int profit=0;
		int localprofit=0;

		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
				indexofmin=i;
				
				
			}
			if(array[i]>max)
			{
				max=array[i];
				indexofmax=i;
				
				if(indexofmin<indexofmax)
					min=array[i];
		
			}
			
			localprofit=max-min;
			if(localprofit>profit)
				profit=localprofit;
			
			
		}
		
	//	if(max-min>profit)
		//	profit=max-min;
		return profit;
		
		
	}
	public static void main(String agrs[])
	{
		
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=input.nextInt();
		
		System.out.println(getMaxProfit(array));
			
		
	}

}
