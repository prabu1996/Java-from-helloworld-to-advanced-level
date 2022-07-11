import java.io.*;
class SecondLargestNumInAcsendingOrder
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j,x,m;
			int a[]={15,1,25,8,62,0};
			n=a.length;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[j]<a[i])
					{
						x=a[i];
						a[i]=a[j];
						a[j]=x;
					}
					
				}
			}
			System.out.println(a[n-2]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}