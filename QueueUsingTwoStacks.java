import java.util.Stack;


public class QueueUsingTwoStacks 
{
	Stack<Integer> s1,s2;

	public QueueUsingTwoStacks()
	{
		s1=new Stack<>();
		s2=new Stack<>();
	}
	
	public int size()
	{
		return s1.size()+s2.size();
	}
	
	public void add(int value)
	{
		s1.push(value);
	}
	
	public int peek()
	{
		if(!s2.empty())
			return s2.peek();
		
		while(!s1.empty())
		{
			s2.push(s1.pop());
			return s2.peek();
		}
	}
	
	public int remove()
	{
		if(!s2.empty())
			return s2.pop();
		while(!s2.empty())
		{
			s2.push(s1.pop());
			
		}
		
		return s2.pop();
	}
}
