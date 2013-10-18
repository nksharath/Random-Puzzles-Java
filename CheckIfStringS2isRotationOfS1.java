
public class CheckIfStringS2isRotationOfS1 
{
	public static void main(String args[])
	{
		String a="ABCD";
		String b="CDAB"; // ACBD gives false
		String c=a+a;
		if(c.contains(b))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
