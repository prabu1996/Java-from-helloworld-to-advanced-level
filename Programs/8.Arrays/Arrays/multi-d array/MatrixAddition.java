import java.io.*;
class MatrixAddition
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j;
			System.out.println("row or columnsize");
			n=Integer.parseInt(t.readLine());
			int[][] a=new int[n][n];
			int[][] b=new int[n][n];
			int[][] c=new int[n][n];
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.println("enter a["+i+"]["+j+"]=");
					a[i][j]=Integer.parseInt(t.readLine());
				}
				for(j=0;j<n;j++)
				{
					System.out.println("enter b["+i+"]["+j+"]=");
					b[i][j]=Integer.parseInt(t.readLine());
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
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