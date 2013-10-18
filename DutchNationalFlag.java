class DutchNationalFlag
{
	void sortArray(int a[])
	{
		int startIndex=0;
		int endIndex=a.length-1;
		int low=2;
		int high=2;
		
		for(int i=0;i<=endIndex;)
		{
			if(a[i]<low)
			{
				int temp=a[i];
				a[i]=a[startIndex];
				a[startIndex]=temp;
				startIndex++;
				i++;
			}
			else if(a[i]>high)
			{

				int temp=a[i];
				a[i]=a[endIndex];
				a[endIndex]=temp;
				endIndex--;
				
			}
			else
				i++;
		}

		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

	public static void main(String args[])
	{
		DutchNationalFlag obj=new DutchNationalFlag();
		int a[]={2,3,1};

		obj.sortArray(a);
	}
}
