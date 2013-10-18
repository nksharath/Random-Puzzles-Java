import java.util.HashMap;
import java.util.HashSet;


public class greatestElementToTheRight 
{
	public static void main(String args[])
	{
		
		int a[]=new int[10];
		int index =9;
		for(int i=0;i<10;i++)
		{
			a[i]=i+1;
		}
		
		if(index==a.length-1)
			System.out.println("Invalid");
		
		else
		{
			int max=a[index];
			int i=index+1;
			while(i<a.length)
			{
				if(a[i]>max)
				{
					max=a[i];
					break;
				}
				i++;
			}
			System.out.println(max);
		}
	}
}
		
		
		