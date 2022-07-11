import java.io.*;
class TestDaysInAMonth
{
	public static void main(String arg[])
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			int X;
			System.out.println("input month code");
			X=Integer.parseInt(t.readLine());
			if ((X%2==0)&&(X!=2))
				System.out.println("30days");
			else if (X==2)
				System.out.println("28days");
			else 
				System.out.println("31days");	
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}