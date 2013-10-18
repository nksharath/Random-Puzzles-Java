import java.nio.charset.Charset;
import java.util.HashSet;


public class UniqueChar 
{
	public static void main(String args[])
	{
		String a="SASASASASSAdndsakue";
		HashSet<Character> set=new HashSet();
		boolean flag=false;
		for(int i=0;i<a.length();i++)
		{
			if(set.contains(a.charAt(i)))
			{
				flag=true;
			}
			set.add(a.charAt(i));
		}
		
		System.out.println(flag+" "+set);
	}

}
