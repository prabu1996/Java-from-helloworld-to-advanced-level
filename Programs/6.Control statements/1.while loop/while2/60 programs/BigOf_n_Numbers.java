import java.io.*;
class BigOf_n_Numbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter n value"); //no.of students
			int n=Integer.parseInt(t.readLine());
			int i=1;
			int big=0;
			while(i<n+1)
			{
				System.out.println("enter"+i+"st value");
				int input=Integer.parseInt(t.readLine());
				if(big<input)
					big=input;
				i++;

			}
			System.out.println("Biggest of n number is = "+big);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}