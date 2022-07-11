import java.io.*;
class TestAddEvenFactorial
{
	public static void main(String arg[])
	{
	try
	{
		DataInputStream t=new DataInputStream(System.in);
		int Input,Output,a,b,c;
		System.out.println("for which num u need addition of Even factorials?");
		Input=Integer.parseInt(t.readLine());
		Output=0;
		a=2;
		b=1;
		c=1;
		while(a<=Input)
		{	
			if(a%2==0)
			{
				b=a*b*c;
				Output+=b;
			}
			else 
				c=a;
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