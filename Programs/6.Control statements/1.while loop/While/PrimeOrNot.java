import java.io.*;
class PrimeOrNot
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a,i,z,n,m,x;
			System.out.println("enter number for prime check=");
			a=Integer.parseInt(t.readLine());
			i=3;
			n=0;
			m=0;
			x=3;
			if(a==1)
				System.out.println("non prime number"); 
			else if((a==2)||(a==3))
				System.out.println("prime number");
			else if(a%2==0)
				System.out.println(a+"is non prime number");
			else if(a%i!=0)
			{
				while(i<a)
				{
					if(a%i!=0)
					{
						n+=1;
						i+=2;
					}
				}
				System.out.println(n);	
				while(x<a)
				{
					if(a%x!=0)
					{
						m+=1;	
					}
					x+=2;	
				}
				System.out.println(m);	
				if(m==n)
					System.out.println(a+"is prime number");
			}
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}