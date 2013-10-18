class leastDiff
{
	int binarySearch(int n,int a[],int low,int mid,int high)
	{
		

		if(a[mid]==n)
			return 0;
		
		if(low==mid || mid==high)
		{
			int result1=Math.abs(n-a[low]);
			int result2=Math.abs(n-a[high]);
			
			if(result1>result2)
				return result2;
			
			else
				return result1;
			
		}
		
		else
		if(n > a[mid])
		{
			low=mid+1;
			mid=(low+high)/2;
			return binarySearch(n,a,low,mid,high);
		}
		
		else
		if(n < a[mid])
		{
			high=mid-1;
			mid=(low+high)/2;
			return binarySearch(n,a,low,mid,high);
		}
		
		return 0;
	
	
		
		
	}
	
	public static void main(String args[])
	{
		int a[]={20,30,45,60,75};
		int n=80;
		int low=0;
		int mid=(a.length-1)/2;
		int high=a.length-1;
		leastDiff obj=new leastDiff();
		System.out.println(obj.binarySearch(n,a,low,mid,high));
	}
}	
