import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


class MaxSum
{
	
	HashMap<Integer,Integer> mymap=new HashMap();

	void buildMap(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			mymap.put(a[i],a[i]);
		}

	}


	void invalidateNeighbour(int n,int a[])
	{
		if(!mymap.containsKey(n))
			return;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				int left=0;
				if(i-1>=0)
				left=a[i-1];
				int current=a[i];
				int right=0;
				if(i!=a.length-1)
				right=a[i+1];
				mymap.remove(left);
				mymap.remove(right);
				break;
			}
		}
	}

	int desiredResult(int a[])
	{
		int b[]=new int[a.length];
		b=a.clone();
		Arrays.sort(b);
		

		for(int i=b.length-1;i>0;i--)
			invalidateNeighbour(b[i],a);

		int sum=0;
		
		for(Integer s : mymap.keySet())
		{
			sum+=s;
		}
		
		return sum;
	}

	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};

		MaxSum obj=new MaxSum();
		obj.buildMap(a);

		System.out.println(obj.desiredResult(a));
	
	}
		
}
	
		

	
		
 