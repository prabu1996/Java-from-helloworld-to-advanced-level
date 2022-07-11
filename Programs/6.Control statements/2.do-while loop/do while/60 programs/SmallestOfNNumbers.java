import java.io.*;
class SmallestOfNNumbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int count,n1,n2,i;
			System.out.println("total numbers");
			count=Integer.parseInt(t.readLine());
			System.out.println("num1=?");
			n1=Integer.parseInt(t.readLine());
			i=2;
			do
			{
				System.out.println("num"+i);
				n2=Integer.parseInt(t.readLine());
				if(n2<=n1)
					n1=n2;
				i++;	
			}
			while(i<=count);
			System.out.println("smallest numer is"+n1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}