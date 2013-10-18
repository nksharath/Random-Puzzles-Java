import java.util.HashSet;


public class Pythagorean {
	
	public static void main(String args[])
	{
		int a[]=new int[10];
		for(int i=0;i<10;i++)
			a[i]=i+1;
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<10;i++)
			set.add(a[i]*a[i]);
		
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
			{
				int temp=a[i]*a[i]+a[j]*a[j];
				if(set.contains(temp))
					System.out.println(a[i]+" "+a[j]+ " "+Math.sqrt(temp));
				
			}
		
	}

}
