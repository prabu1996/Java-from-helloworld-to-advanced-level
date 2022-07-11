import java.io.*;
class Test6
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,x,count;
			int[] a={10,20,30,40,50};
			n=a.length;
			System.out.println("what eleement you are looking for");
			x=Integer.parseInt(t.readLine());
			count=0;
			for(i=0;i<n;i++)
			{
				if(a[i]==x)
				{
					System.out.println("the position of element we looking for= a["+i+"]");	
					i=n;
				}
				else 
					count+=1;		
			}
			//System.out.println(count);
			if(count==5)
				System.out.println("The element we looking for is not present in the array");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}