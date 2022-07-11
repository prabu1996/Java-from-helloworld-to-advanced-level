import java.io.*;
class PerfectNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,per,sumofdivisors;
			System.out.println("number=");
			n=Integer.parseInt(t.readLine());
			i=1;
			sumofdivisors=0;
			do
			{
				if(n%i==0)
				{
					sumofdivisors+=i;
				}
				i++;		
			}
			while(i<n);
			if((sumofdivisors==n)&&(n>1))
				System.out.println("perfect number");
			else
				System.out.println("non perfect number");			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}