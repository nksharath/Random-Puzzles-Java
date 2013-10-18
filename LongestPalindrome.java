import java.util.HashSet;
import java.util.Iterator;


public class LongestPalindrome 
{
	public static void main(String args[])
	{
		StringBuffer input=new StringBuffer("racecar");
		HashSet<StringBuffer> set=new HashSet<>();

		StringBuffer result=new StringBuffer();
		for(int i=0;i<input.length();i++)
		{
			result.append(input.charAt(i));
			for(int j=i+1;j<input.length();j++)
			{
				result.append(input.charAt(j));
				StringBuffer temp=new StringBuffer(result);
				System.out.println("RESULT "+temp);
				StringBuffer reverse=result.reverse();
				result=temp;
				System.out.println("REVERESE "+reverse);
				if(temp.toString().equals(reverse.toString()))
				{
					set.add(reverse);	
					System.out.println("Added "+reverse);
				}
				
			}
			result=new StringBuffer();
		}
		
		System.out.println(set);
		
	}

}
