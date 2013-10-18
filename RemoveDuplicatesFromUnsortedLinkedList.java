import java.util.HashSet;
import java.util.LinkedList;


public class RemoveDuplicatesFromUnsortedLinkedList
{
	public static void main(String args[])
	{
		LinkedList<Integer> list=new LinkedList();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		
		list.add(1);
		list.add(2);
		System.out.println(list);
		LinkedList<Integer> result=new LinkedList(new HashSet(list));
		
		System.out.println(result);
	}

}
