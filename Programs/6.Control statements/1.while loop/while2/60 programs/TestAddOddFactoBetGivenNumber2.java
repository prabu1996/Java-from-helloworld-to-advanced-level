import java.io.*;
class TestAddOddFactoBetGivenNumber2
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input;
			double Output,a,b,c;
			System.out.println("Input=");
			Input=Integer.parseInt(t.readLine());
			Output=0;
			a=1;
			while(a<=Input)
			{
				if(a%2!=0)
				{
					b=(a*a);
					c=1/b;
					Output+=c;
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