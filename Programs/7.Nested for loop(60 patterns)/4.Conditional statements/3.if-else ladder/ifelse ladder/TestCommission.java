import java.io.*;
class TestCommission
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			double x,y,z;
			System.out.println("sales");
			x=Double.parseDouble(t.readLine());
			y=0;
			z=0;
			if (x<10000)
				y=0;
			else if ((x>=10000)&&(x<50000))
				y=(x*0.05);
			else if ((x>=50000)&&(x<100000))
				y=(x*0.1);
			else if((x>=100000)&&(x<150000))
				y=(x*0.15);
			else 
				y=((x*0.2)+1000);
			System.out.println("commission is "+y+" rupees");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}