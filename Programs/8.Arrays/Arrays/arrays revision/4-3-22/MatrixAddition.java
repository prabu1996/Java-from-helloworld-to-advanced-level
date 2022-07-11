import java.io.*;
class MatrixAddition
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,m,i,j;
			System.out.println("row size");
			n=Integer.parseInt(t.readLine());
			System.out.println("column size");
			int[][] a=new int[n][m];
			int[][] b=new int[n][m];
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.println("enter a["+i+"]b[+"+j+"value");
					int[n][m]=Integer.parseInt(t.readLine());
				}
				for(k=0;j<m;k++)
				{
					System.out.println("enter a["+i+"]b[+"+k+"value");
					int[n][k]=Integer.parseInt(t.readLine());
				}
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}