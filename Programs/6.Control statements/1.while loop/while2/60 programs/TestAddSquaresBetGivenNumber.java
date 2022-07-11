import java.io.*;
class TestAddSquaresBetGivenNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input,Output,b;
			System.out.println("input= ?");
			Input=Integer.parseInt(t.readLine());
			double a=1;
			Output=0;
			while(a<=Input)
			{
				b=(int)Math.pow(a,2);
				Output+=b;
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