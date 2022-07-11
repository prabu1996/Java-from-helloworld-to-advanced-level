import java.io.*;
class Test8
{
	public static void main(String arg[])
	{
	  try
	  {
		DataInputStream t=new DataInputStream(System.in);
		int n,x,i;
		int[] a={10,20,30,40,50};
		n=a.length;
		System.out.println("element to be removed");
		x=Integer.parseInt(t.readLine());
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				a[i]=a[n-1];
				n--;
			}
		}
		System.out.print("int[] a={");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.print("}");
	  }
	  catch(Exception e)
	  {
		System.out.println(e);
	  }
	}
}