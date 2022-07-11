import java.io.*;
class TestAddOddFactorialsInDenominator
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input;
			double Output,a,b,c,d;
			Output=0;
			a=1;
			c=1;
			b=1; 	
			System.out.println("Input=?");
			Input=Integer.parseInt(t.readLine());
			while(a<=Input)
			{
				if(a%2!=0)
				{
					b=a*b*c;
					//System.out.println(b);
					d=1/b;
					Output+=d;			
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