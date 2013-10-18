import java.util.ArrayList;
import java.util.HashMap;

class codes
{
	ArrayList<String> generateCodes(int n)
	{
		HashMap<String,Character> mymap=new HashMap();
		ArrayList<String> result=new ArrayList();
		ArrayList<String> returnResult=new ArrayList();
		
		mymap.put("1",'a');
		mymap.put("2",'b');
		mymap.put("3",'c');
		mymap.put("4",'d');
		mymap.put("5",'e');
		mymap.put("6",'f');
		mymap.put("7",'g');
		mymap.put("8",'h');
		mymap.put("9",'i');
		mymap.put("10",'j');
		mymap.put("11",'k');
		mymap.put("12",'l');
		mymap.put("13",'m');
		mymap.put("14",'n');
		mymap.put("15",'o');
		mymap.put("16",'p');
		mymap.put("17",'q');
		mymap.put("18",'r');
		mymap.put("19",'s');
		mymap.put("20",'t');
		mymap.put("21",'u');
		mymap.put("22",'v');
		mymap.put("23",'w');
		mymap.put("24",'x');
		mymap.put("25",'y');
		mymap.put("26",'z');
	
		String input=((Integer)n).toString();

		for(int i=0;i<input.length();i++)
		{
			String putInResult="";
			String build=""+input.substring(0,i+1);
			putInResult+=build;
			for(int j=i+1;j<input.length();j++)
			{
				String next=""+input.charAt(j);
			
				String temp=putInResult+next;
				if(Integer.parseInt(temp)<26)
				{
					putInResult+=build+","+temp;
					//result.add(build+","+temp);
					build=temp;
				}
				
				else
					putInResult+=","+next;
					
			}
			result.add(putInResult);
		}
		
		for(String s: result)
		{
			String arr[]=s.split(",");
			String store="";
			
			for(String q : arr)
			{
				store+=mymap.get(q);
			}
			
			returnResult.add(store);
		}
		
		return returnResult;
	}
	
	public static void main(String args[])
	{
		codes obj=new codes();
		System.out.println(obj.generateCodes(1123));
	}

	
}

		


				
					
			
		