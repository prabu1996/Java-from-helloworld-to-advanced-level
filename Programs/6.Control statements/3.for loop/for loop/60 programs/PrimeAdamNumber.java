import java.io.*;
class PrimeAdamNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,count,i,ns,rev,revn;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			//prime check
			count=0;
			rev=0;
			revn=0;
			for(i=1; i<=n; i++)
			{
				if(n%i==0)
					count+=1;	
			}
			if(count==2)
			{
				ns=n*n;
				System.out.println(ns);
				for(;ns>0;)	
				{
					rev=rev*10+(ns%10);
					ns=ns/10;
				}
				System.out.println(rev);
				for(;n>0;)
				{
					revn=revn*10+(n%10);
					n=n/10;
				}
				System.out.println(revn);
				revn=revn*revn;
				System.out.println(revn);
				if(revn==rev)
					System.out.println("Prime Adam number");
				else 
					System.out.println("prime number");
			}
			else 
				System.out.println("Non-Prime number");
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}