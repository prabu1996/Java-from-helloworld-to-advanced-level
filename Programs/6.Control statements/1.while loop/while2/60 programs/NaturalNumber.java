import java.io.*;
class NaturalNumber
{
	public static void main(String arg[])
	{
	  try
	  {
		DataInputStream t=new DataInputStream(System.in);
		int n,i;
		System.out.println("enter number");
		n=Integer.parseInt(t.readLine());
		i=1;
		while (i<=n)
		{
			System.out.println(i);
			i++
;		
		}
	   }
	  catch (Exception e)
	  {
		System.out.println(e);
	  }
	}
}