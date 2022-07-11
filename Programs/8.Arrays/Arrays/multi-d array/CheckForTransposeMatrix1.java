import java.io.*;
class CheckForTransposeMatrix1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,j,m,n,count;
			System.out.println("row size");
			m=Integer.parseInt(t.readLine());
			System.out.println("column size");
			n=Integer.parseInt(t.readLine());
			int[][] a=new int[n][m];
			int[][] b=new int[n][m];
			count=0;
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.println("a["+i+"]["+j+"]");
					a[i][j]=Integer.parseInt(t.readLine());
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					b[j][i]=a[i][j];
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print(b[i][j]);
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
