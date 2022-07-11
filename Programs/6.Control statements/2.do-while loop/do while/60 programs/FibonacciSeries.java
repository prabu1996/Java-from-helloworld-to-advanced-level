import java.io.*;
class FibonacciSeries
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int len,num1,num2,nxtnum,i;
			System.out.println("fibo series length");
			len=Integer.parseInt(t.readLine());
			if(len<3)
				System.out.println("length of series shoulbe min 3");
			else if(len>=3)
			{
				System.out.println("1st num of fibo series");
				num1=Integer.parseInt(t.readLine());
				System.out.println("2nd num of fibo series");
				num2=Integer.parseInt(t.readLine());
				i=3;
				System.out.print(num1+" ");
				System.out.print(num2+" ");
				do
				{
					nxtnum=num1+num2;
					num1=num2;
					num2=nxtnum;
					i++;
					System.out.print(nxtnum+" ");
				}
				while(i<=len );
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}