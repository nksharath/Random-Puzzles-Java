import java.util.ArrayList;


public class Replacespaces 
{
	public static void main(String args[])
	{
		StringBuffer a=new StringBuffer("hello java");
		
		ArrayList<Character> result=new ArrayList<>();
		
		for(int i=0;i<a.length();i++)
		{
			char temp=a.charAt(i);
			if(temp== ' ')
			{
				result.add('%');
				result.add('2');
				result.add('0');
			}
			else
				result.add(temp);
				
			
		}
		
		System.out.println(result);
		
	}	
	
}
