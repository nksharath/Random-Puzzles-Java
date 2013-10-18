import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class HashSetExample {
	
	public static void main(String args[])
	{
		LinkedList<Integer> list=new LinkedList();
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(1);
		list.add(2);
		list.add(15);
		list.add(3);
		
		LinkedHashSet unique=new LinkedHashSet(list);
		
		System.out.println(unique);
		
		HashMap map=new HashMap<>();
		 map.put(1, "Gyan");
         map.put(6, "Ankit");
         map.put(5, "Arun");
         map.put(4, "Anand");
         map.put(3, "Ram");
         map.put(0, null);
         
         System.out.println(map);
		
		ArrayList<Integer> sorttest=new ArrayList<>();
		Collections.sort(list);
	}
	


}
