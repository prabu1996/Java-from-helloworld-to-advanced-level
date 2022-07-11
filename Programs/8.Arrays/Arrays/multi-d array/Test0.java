import java.io.*;
class Test0
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,m,i,j;
			System.out.println("no of rows");
			n=Integer.parseInt(t.readLine());
			System.out.println("no of column");
			m=Integer.parseInt(t.readLine());
			int[][] a=new int[n][m];
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.println("element"+j+" of"+"row"+i);
					a[i][j]=Integer.parseInt(t.readLine());
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}