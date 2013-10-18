
public class ReverseCString 
{
	public static void main(String args[])
	{
		StringBuffer a=new StringBuffer("abcd ");
		
		StringBuffer b=new StringBuffer(a.substring(0, a.length()-1));
		System.out.println(b.reverse()+" Length "+b.length());
		
	}

}
