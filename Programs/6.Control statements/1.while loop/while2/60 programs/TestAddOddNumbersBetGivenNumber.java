import java.io.*;
class TestAddOddNumbersBetGivenNumber
{
	public static void main(String arg[])
	{
	try
	{
		DataInputStream t=new DataInputStream(System.in);
		int Input,Output,a;
		System.out.println("enter number");
		Input=Integer.parseInt(t.readLine());
		a=1;
		Output=0;
		while(a<=Input)
		{
			if(a%2!=0)
			
				Output+=a;
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