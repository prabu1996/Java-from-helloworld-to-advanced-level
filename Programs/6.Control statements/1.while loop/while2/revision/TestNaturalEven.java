import java.io.*;
class TestNaturalEven
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input,Output;
			System.out.println("input=");
			Input=Integer.parseInt(t.readLine());
			Output=1;
			while(Output<=Input)
			{
				if(Output%2==0)
				{
					System.out.println(Output);
				}

				Output++;
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	   System.out.println("super");
	}
}