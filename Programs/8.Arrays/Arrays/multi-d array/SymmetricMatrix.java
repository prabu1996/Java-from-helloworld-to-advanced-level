import java.io.*;
class SymmetricMatrix
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,j,n,count;
			System.out.println("array size");
			n=Integer.parseInt(t.readLine());
			int[][] a=new int[n][n];
			int[][] b=new int[n][n];
			count=0;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.println("a["+i+"]["+j+"]");
					a[i][j]=Integer.parseInt(t.readLine());
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					b[j][i]=a[i][j];
				}
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(b[i][j]==a[i][j])
						count+=1;
				}
			}
			if(count==(n*n))
				System.out.println("Symmetric matrix");

			else
				System.out.println("Non-Symmetric matrix");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}