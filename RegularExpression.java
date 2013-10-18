import java.util.ArrayList;
import java.util.Arrays;


public class RegularExpression {
	
	static ArrayList<Character> one=new ArrayList();
    static ArrayList<Character> two=new ArrayList();
	
	
	static void trim()
	{
		for(int i=0;i<one.size();i++)
		{
			if(one.get(i)=='*')
			{
				one.remove(i);
				one.remove(i-1);
			}
		}
		
	}
	
	static boolean isMatch()
	{
		boolean flag=false;
		for(int i=0;i<one.size();i++)
		{
			if(one.get(i)==two.get(i) || one.get(i)=='.')
				flag=true;
			
			else
			{
				flag=false;
				break;
			}
			
			
			
		}
		
		if(flag)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		String One="a.";
		String Two="ab";
		
		for(int i=0;i<One.length();i++)
		{
			one.add(One.charAt(i));
			
		}
		
		for(int i=0;i<Two.length();i++)
		{
			two.add(Two.charAt(i));
			
		}
		
		trim();
		System.out.println(one);
		System.out.println(isMatch());
		
		
	}
	
	

}
