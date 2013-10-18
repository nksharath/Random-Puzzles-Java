
public class Rotate90 
{
	public static void main(String args[])
	{
		int [][] a =new int[3][3];
		int row=a.length;
		int col=a[0].length;
		
		int count=1;
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=count++;
		
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;				
			}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[0].length/2;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[i][a[0].length-j-1];
				a[i][a[0].length-j-1]=temp;
				
			}
		}
		
	
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				
			}
			System.out.println();
		}
	}
	

}
