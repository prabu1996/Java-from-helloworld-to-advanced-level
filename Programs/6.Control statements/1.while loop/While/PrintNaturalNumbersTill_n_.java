import java.io.*;
class PrintNaturalNumbersTill_n_
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("input n value");
			int n=Integer.parseInt(t.readLine());  
			int i=1;
			while(i<n+1)
			{	
				int b=i;
				System.out.println(b);
				i++;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}