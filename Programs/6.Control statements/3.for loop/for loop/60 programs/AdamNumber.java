import java.io.*;
class AdamNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,n,rev,x,m,rev1;
			double Nsq;
			System.out.println("number");
			x=Integer.parseInt(t.readLine());
			rev=0;
			rev1=0;
			n=x;
			for(;n>0;)
			{
				rev=rev*10+(n%10);
				n/=10;
			}
			System.out.println(rev);
			Nsq=Math.pow(x,2);
			System.out.println(Nsq);
			m=rev*rev;
			System.out.println(m);
			for(;m>0;)
			{
				rev1=rev1*10+(m%10);
				m/=10;
			}
			System.out.println(rev1);
			if(rev1==Nsq)
				System.out.println("Adam number");
			else 
				System.out.println("Not an adam number");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}