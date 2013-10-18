
public class PostIncreament {
	
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("aabb");
		boolean hit[]=new boolean[256];
		
		for(int i=0;i<hit.length;++i)
		{
			hit[i]=false;
		}
		
		int len=str.length();
		int tail=1;
		hit[str.charAt(0)]=true;
		
		for(int i=1;i<len;++i)
		{
			if(!hit[str.charAt(i)])
			{
				str.setCharAt(tail, str.charAt(i));
				++tail;
				hit[str.charAt(i)]=true;
			}
		}
		
		str.setCharAt(tail, '0');
		
	
	
		System.out.println(str);
	}
	


}
