import java.io.*;
class SumOf_n_Numbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter n value"); //no.of students
			int n=Integer.parseInt(t.readLine());
			int i=1;
			int output=0;
			while(i<n+1)
			{
				System.out.println("enter"+i+"st value");
				int input=Integer.parseInt(t.readLine());
				output+=input;
				i++;

			}
			System.out.println(output);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}