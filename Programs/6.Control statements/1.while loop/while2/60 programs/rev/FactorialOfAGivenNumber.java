import java.io.*;
class FactorialOfAGivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a,i,z;
			System.out.println("num for factorial");
			a=Integer.parseInt(t.readLine());
			i=1;
			z=1;
			while(i<a+1)
			{
				z*=i;
				i++;
			}
			System.out.println(z);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}