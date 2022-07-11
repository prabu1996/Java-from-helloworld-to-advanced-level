import java.io.*;
class TestAddSqrOfEvenNumbers
{
	public static void main(String arg[])
	{
	try
	{
		DataInputStream t=new DataInputStream(System.in);
		int Input,Output,a,b;
		System.out.println("input=");
		Input=Integer.parseInt(t.readLine());
		Output=0;
		a=1;
		while(a<=Input)
		{
			if(a%2==0)
			{
				b=(a*a);
				Output+=b;
			}	
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