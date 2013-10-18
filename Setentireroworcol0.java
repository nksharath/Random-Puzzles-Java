
public class Setentireroworcol0 
{
	public static void main(String args[])
	{
		int [][]a=new int[3][3];
		int []row=new int[a.length];
		int []col=new int[a[0].length];
		int count=1;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				a[i][j]=count++;
			}
		
		a[2][2]=0;
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==0)
				{
					row[i]=1;
					col[j]=1;
				}
			}
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				if(row[i]==1 ||col[j]==1)
					a[i][j]=0;
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
