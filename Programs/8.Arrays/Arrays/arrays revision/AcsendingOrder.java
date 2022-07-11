import java.io.*;
class AcsendingOrder
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j,x;
			//int[] a={58,68,7,1,18,29,78};
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
			for(i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}