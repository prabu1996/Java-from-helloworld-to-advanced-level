import java.io.*;
class BigOfNNumbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int count,n1,num,i;
			System.out.println("total no of students=");
			count=Integer.parseInt(t.readLine());
			System.out.println("enter number1");
			n1=Integer.parseInt(t.readLine());
			i=2;
			do
			{
				System.out.println("enter number"+i);
				num=Integer.parseInt(t.readLine());
				if(num>n1)
					n1=num;
				i++;	
			}
			while(i<=count);
			System.out.println("Biggest num is"+n1);
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}