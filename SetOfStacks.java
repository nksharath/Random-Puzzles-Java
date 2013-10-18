import java.util.ArrayList;
import java.util.Stack;



public class SetOfStacks 
{
	ArrayList<Stack> stacks=new ArrayList<Stack>();
	
	public int pop()
	{
		Stack last=getlastStack();
		int value=last.pop();
		if(last.size()==0)
			stacks.remove(stacks.size()-1);
		return value;
	}
	
	public void push(int value)
	{
		Stack last=getLastStack();
		if(last!=null && !last.isAtCapacity())
			last.push(value);
		else
		{
			Stack stack=new Stack(capacity);
			stack.push(value);
			stacks.add(stack);
		}
		
	}

}
