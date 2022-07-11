import java.io.*;
class Test7
{
	public static void main(String arg[])
	{
	  try
	  {
		DataInputStream t=new DataInputStream(System.in);
		int i,n,x,count;
		int[] a={10,20,30,40,50};
		n=a.length;
		System.out.println("Input index needed array element");
		x=Integer.parseInt(t.readLine());
		count=0;
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
				System.out.println("Index of element"+x+"is="+i);
			else
				count+=1;
		}
		if(count==n)
			System.out.println(x+"is not an element of array");
	  }
	  catch(Exception e)
	  {
		System.out.println(e);
       	  }
	}
}