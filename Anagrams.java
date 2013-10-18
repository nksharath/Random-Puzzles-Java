import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class Anagrams 
{
	public static void main(String agrs[])
	{
		String a="abdc";
		String b="acdb";
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		a=new String(c);
		b=new String(d);
		
		if(a.equals(b))
		System.out.println("Anagram");
		
		HashMap<Integer,?> map=new HashMap<>();

	}

}
