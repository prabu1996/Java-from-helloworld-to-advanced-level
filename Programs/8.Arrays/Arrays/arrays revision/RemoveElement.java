import java.io.*;
class RemoveElement
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,x,m;
			int[] a={10,20,30,40,50};
			n=a.length;
			System.out.println("no of elements to be removed");
			m=Integer.parseInt(t.readLine());
			int[] b=new int[m];
			for(i=0;i<m;i++)
			{
				System.out.println("element to be removed");
				b[i]=Integer.parseInt(t.readLine());	
			}
			x=Integer.parseInt(t.readLine());
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					if(a[i]==b[j])
					{
						a[i]=a[i+1];
						i=i+1;	
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