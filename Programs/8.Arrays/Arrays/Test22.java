import java.io.*;
class Test22
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,count,x,y,j;
			System.out.println("array size");
			n=Integer.parseInt(t.readLine());
			int[] a=new int[n];
			int[] b=new int[n];
			y=n*n;
			x=0;
			for(i=0;i<n;i++)
			{
				System.out.println("enter a["+i+"]value");	
				a[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				System.out.println("enter b["+i+"] value");
				b[i]=Integer.parseInt(t.readLine());
			}
			for(i=0;i<n;i++)
			{
				count=0;
				for(j=0;j<n;j++)
				{
					if(a[i]==b[j])
						count+=1;
					else 
						x++;
				}
				if(count>0)
					System.out.println("Coomon element is"+a[i]);
			}
			if(x==y)
				System.out.println("No common elements in the given arrays");	
			//System.out.println(x);
			//System.out.println(y);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}