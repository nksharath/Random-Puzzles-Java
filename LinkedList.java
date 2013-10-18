
public class LinkedList 
{
	Node head=null;
	Node tail=null;
	Node temp=null;
	int counter=0;
	
	public int size()
	{
		return counter;
	}
	
	public void add(int element)
	{
		if(head==null)
		{
			head=new Node();
			tail=new Node();
			head.data=element;
			head.next=tail;
			tail=head;
		}
		
		else
		{
			tail.next=new Node();
			tail=tail.next;
			tail.data=element;
		}
		counter++;
	}
	
	public void add(int element,int index)
	{
		if(index==size())
		{
			add(element);
			return;
		}
		else
		{
			if(index==0)
			{
				Node temp=new Node();
				temp.data=element;
				temp.next=head;
				head.previous=temp;
				head=temp;
				counter++;
				return;
			}
			
			temp=head;
			
			for(int i=0;i<index;i++)
				temp=temp.next;
			
			Node insert=new Node();
			insert.data=element;
			insert.next=temp.next;
			temp.next=insert;
			counter++;
		}
		
	}
	
	public int get(int index)
	{
		if(index<0 || index>size())
			return -1;
		else
		{
			temp=head;
			for(int i=0;i<index;i++)
				temp=temp.next;
			
			return temp.data;
		}
	}
	
	
	public int remove(int index)
	{
		assert((index>=0 && index<size()));
		
		temp=head;
		
		if(index==0)
		{
			int element=head.data;
			head=head.next;
			counter--;
			return element;
		}
		
		else if(index==size())
		{
			int element=tail.data;
			tail=tail.previous;
			counter--;
			return element;
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{
				temp=temp.next;
			}
			int element=temp.next.data;
			temp.next=temp.next.next;
			counter--;
			return element;
			
		}
		
		
	}
	
	void printList()
	{
		for(Node n=head;n!=null;n=n.next)
			System.out.print(n.data+"  ");
	}
	
	LinkedList nthToLast(int n)
	{
		temp=head;
		for(int i=0;i<n-1;i++)
			temp=temp.next;
		LinkedList result=new LinkedList();
		
		while(temp!=null)
		{
			result.add(temp.data);
			temp=temp.next;
		}
		
		return result;
	}
	
	static LinkedList addtwolists(LinkedList l1,LinkedList l2)
	{
		LinkedList result=new LinkedList();
		int carry=0;
		int i=0;
		
		while(i<l1.size())
		{
			//System.out.println("l1 "+l1.get(i));
			//System.out.println("l2 "+l2.get(i));
			
			int sum=l1.get(i)+l2.get(i);
			if(sum>10)
				carry=1;
			result.add(sum%10+carry);
			i++;
		}
		return result;
	}
	
	void circular()
	{
		temp=head;
	
		while(temp.next!=null)
			temp=temp.next;
		
		temp.next=head.next.next.next;
	}
	
	Node acyclic()
	{
		Node result=new Node();
		Node n1=head;
		Node n2=head;
		while(n2.next!=null)
		{
			n1=n1.next;
			
			n2=n2.next.next;
			System.out.println("N1 "+n1.data);
			System.out.println("N2 "+n2.data);
			
		if(n1==n2)
		{
			System.out.println("N1=N2 "+n1.data );
			break;
		}
		}
		
		n1=head;
		while(n1!=n2)
		{
			n1=n1.next;
			n2=n2.next;
		}
		return n2;
		
	}
	
	void reverse()
	{
		Node left=head;
		Node current=head.next;
		Node right=head.next.next;
		
		left.next=null;
		while(right!=null)
		{
			current.next=left;
			left=current;
			current=right;
			right=right.next;
		}		
		current.next = left;
		head = current;
	}
	
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		LinkedList list2=new LinkedList();
		for(int i=0;i<10;i++)
			{
			list.add(i+1);
			list2.add(i+1);
			}
		
		int temp=list.get(5);
		System.out.println(temp);
		//System.out.println(list.remove(5));
		
		LinkedList listnew=list.nthToLast(5);
		
		list.printList();
		System.out.println();
		listnew.printList();
		
	LinkedList sum=new LinkedList();
	sum=addtwolists(list, list2);
	
	sum.printList();
	System.out.println();
	list2.printList();
	System.out.println();
	list2.circular();
	
	Node result=list2.acyclic();
	
	System.out.println();
	System.out.println("Cyclic at "+result.data);
	
	list.reverse();
	System.out.println("AFTER REVERSE");
	list.printList();	
	
	}
}
	
			
		
		
		
		
		
		
	


