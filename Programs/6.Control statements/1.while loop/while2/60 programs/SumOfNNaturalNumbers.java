import java.io.*;
class SumOfNNaturalNumbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int number,i,a;
			System.out.println("enter number");
			number=Integer.parseInt(t.readLine());
			i=1;
			a=number;
			while (i<number)
			{
				a+=i;
				i++;	
			}
			System.out.println(a);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}