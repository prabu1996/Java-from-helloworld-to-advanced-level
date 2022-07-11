import java.io.*;
class TestAddFactoBetGivenNumber2
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input;
			double Output,a,b,c;
			System.out.println("input= ?");
			Input=Integer.parseInt(t.readLine());
			a=1;
			b=1;
			Output=0;
			while(a<=Input)
			{
				
				b*=a;
				c=1/b;
				Output+=c;
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