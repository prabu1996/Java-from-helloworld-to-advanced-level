import java.io.*;
class TestAddCubeOfNumbers
{
	static public void main(String[] args)
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input;
			double Output,a;
			Output=0;
			a=1;
			System.out.println("input=");
			Input=Integer.parseInt(t.readLine());
			while(a<=Input)
			{
				Output+=(int)(Math.pow(a,3));
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