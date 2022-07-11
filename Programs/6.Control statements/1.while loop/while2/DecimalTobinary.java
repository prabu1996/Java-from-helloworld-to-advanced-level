import java.io.*;
class DecimalTobinary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int num,rem,i,a;
			System.out.println("number=");
			num=Integer.parseInt(t.readLine());
			i=1;
			a=i*2;
			b=num-a;
			x=b;
			count=0;
			while(x>0)
			{
				count+=(x%10);
				x/=10;
			}
			if(count%2==0)
				rem=0;
			else
				rem=1;
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}