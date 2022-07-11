import java.io.*;
class TestPrintCurrentAndPreviousOdds
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input,Output,a;
			System.out.println("number=");
			Input=Integer.parseInt(t.readLine());
			a=Input;
			Output=0;
			while(a<=Input)
			{
				if(a%2==0)
				{
					a-=1;
				}
				if(a%2!=0)
				{	b=a;
					c=1;
					while(c<=2)
					{					
						Output=a;
						System.out.println(Output);
						c++;
					}
				}
				
			}
			System.out.println(Output);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}