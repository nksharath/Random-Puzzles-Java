import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AnagramBucket 
{
	public static void anagramBuckets(List<String> input)
	{
		
		HashMap<String,ArrayList<String>> anagrams=new HashMap();
		for(int i=0;i<input.size();i++)
		{
		
			char []arr=input.get(i).toCharArray();
			Arrays.sort(arr);
			String arr1=new String(arr);
			if(!anagrams.containsKey(arr1))
			anagrams.put(arr1,new ArrayList<String>());
		}
		System.out.println(anagrams.containsKey("cei"));
		for(int i=0;i<input.size();i++)
		{
			char []arr=input.get(i).toCharArray();
			Arrays.sort(arr);
			String arr1=new String(arr);
			if(anagrams.containsKey(arr1))
			{
			
				ArrayList<String> temp=anagrams.get(arr1);
				temp.add(input.get(i));
				
			}
		}
		

		for(String s : anagrams.keySet())
		{
			ArrayList<String> temp=anagrams.get(s);
			System.out.println(s+" "+temp);
		}
	}
	
	public static void main(String args[])
	{
		List<String> input=new ArrayList<String>();
		input.add("star");
		input.add("rats");
		input.add("ice");
		input.add("cie");
		input.add("arts");
		
		anagramBuckets(input);
	}
		

}
