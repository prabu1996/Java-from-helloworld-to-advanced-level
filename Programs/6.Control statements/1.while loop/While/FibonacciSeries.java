import java.io.*;
class FibonacciSeries
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,a,b,c,i;
			System.out.println("n=");
			n=Integer.parseInt(t.readLine());
			System.out.println("1st digit of fibo series");
			a=Integer.parseInt(t.readLine());
			System.out.println("2nd digit of fibo series");
			b=Integer.parseInt(t.readLine());
			x=a;
			y=b;
			i=3;
			while(i<n+1)
			{
				m=x+y+",";
				z=a+","+b+","+m;
				System.out.println(z);
				a+=1;
				b+=1;
				i++;	
			}
			//System.out.println(a+","+b+","+c);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}