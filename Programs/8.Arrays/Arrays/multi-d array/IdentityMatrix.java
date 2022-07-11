import java.io.*;
class IdentityMatrix
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,j,n,x,count,sum;
			System.out.println("row size");
			n=Integer.parseInt(t.readLine());
			int[][] a=new int[n][n];
			x=0;
			count=0;
			sum=0;
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
				if(a[i][x]==1)
					count+=1;
				x++;
			}
			if(count==n)
			{	
				for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
					{
						if(i!=j)
						{
							if(a[i][j]==0)
								sum+=1;	
						}			
					}
					System.out.println("sum upto iteration"+i+"="+sum);
				}
				if((count==n)&&(sum==(n*n)-count))
					System.out.println("Identity matrix");
				else 
					System.out.println("Non-Identity matrix");
			}
			
			else 
				
				System.out.println("Non-Identity matrix");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}