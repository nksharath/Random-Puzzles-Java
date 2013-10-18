import java.util.Stack;


public class SortStack 
{
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> r=new Stack<Integer>();
		while(!s.empty())
		{
			int value=s.pop();
			
			while(!r.empty() && r.peek() > value)
			{
				s.push(r.pop());
				
			}
			r.push(value);
		}
		return r;
	}

}
