import java.io.*;
class AdamNumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,b,a,rev,rem,rem1,rev1;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=n;
			a=n*n;
			System.out.println(a);
			rev=0;
			rev1=0;
			do
			{
				rem=a%10;
				rev=rev*10+rem;
				a=a/10;			
			}
			while(a>0);
			do
			{
				rem1=n%10;
				rev1=rev1*10+rem1;
				n=n/10;		
			}
			while(n>0);
			System.out.println(rev);
			System.out.println(rev1);
			b=rev1*rev1;
			System.out.println(b);
			if(rev==b)
				System.out.println(i+"is an adam number");
			else 
				System.out.println(i+" is not an adam number");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}