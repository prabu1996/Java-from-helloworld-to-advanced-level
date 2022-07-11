import java.io.*;
class NaturalNumberReverse
{
	public static void main(String arg[])
	{
	  try
	  {
		DataInputStream t=new DataInputStream(System.in);
		int n,i;
		System.out.println("enter number");
		n=Integer.parseInt(t.readLine());
		i=n;
		while (i>=1)
		{
			System.out.println(i);
			i--;
;		
		}
	   }
	  catch (Exception e)
	  {
		System.out.println(e);
	  }
	}
}