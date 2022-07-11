import java.io.*;
class TestFactorial
{
	public static void main(String arg[])
	{
	try
	{
		DataInputStream t=new DataInputStream(System.in);
		int Input,Output,a;
		System.out.println("for which num u need factorial?");
		Input=Integer.parseInt(t.readLine());
		Output=1;
		a=1;
		while(a<=Input)
		{	
			Output*=a;
			a++;
		}
		System.out.println(Output);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}