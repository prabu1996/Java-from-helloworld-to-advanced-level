import java.io.*;
class TestAddSquareOfOddNumbersWithoutIf
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input,Output,a,b;
			System.out.println("input=?");
			Input=Integer.parseInt(t.readLine());
			Output=0;
			a=1;
			while(a<=Input)
			{
			
				b=(a*a);
				Output+=b;
				a+=2;					
			}
			System.out.println(Output);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}