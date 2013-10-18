import java.util.ArrayList;
import java.util.HashSet;

class pairs
{
	public static void main(String args[])
	{
		HashSet<Integer> myset=new HashSet();
		
		ArrayList<Integer> input=new ArrayList();
		for(int i=5;i<20;i++)
			input.add(i);
		
		for(int i=0;i<input.size();i++)
		{
			myset.add(input.get(i));
			
		}
		
	
		int k=15;

		for(int i=0;i<input.size();i++)
		{
			int number=input.get(i);
			int diff=k-number;
			
			if(myset.contains(diff))
			{
				System.out.println("True");
				System.out.println(diff+" "+number);
				System.exit(1);
			}
		}
		
		System.out.println("False");
	}
}
		