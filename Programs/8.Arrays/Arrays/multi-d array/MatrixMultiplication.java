import java.io.*;
class MatrixMultiplication
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("row size of matrix1");
			r1=Integer.parseInt(t.readLine());
			System.out.println("size of column1");
			c1=Integer.parseInt(t.readLine());
			System.out.println("row size of matrix2");
			r2=Integer.parseInt(t.readLine());
			System.out.println("column size of matrix2");
			c2=Integer.parseInt(t.readLine());
			int i,j;
			int[][] a=new int[r1][c1];
			int[][] b=new int[r2][c2];
			int[][] c=new int[r1][c2];
			if(c1==r2)
			{
				//matrix1 values from user
				for(i=0;i<r1;i++)
				{
					for(j=0;j<c1;j++)
					{
						System.out.println("a["+i+"][+j+"]");
						a[i][j]=Integer.parseint(t.readLine());
					}
				}
				//matrix1 values from user
				for(i=0;i<r2;i++)
				{
					for(j=0;j<c2;j++)
					{
						System.out.println("b["+i+"]["+j+"]");
						b[i][j]=Integer.parseInt(t.readLine());
					}
				}
				for(i=0;i<r1;i++)
				{
					for(j=0;j<c2;j++)
					{
						c[i][j]=a[
					}
				}	
			}
			int[][] a=new int[n][m];
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}