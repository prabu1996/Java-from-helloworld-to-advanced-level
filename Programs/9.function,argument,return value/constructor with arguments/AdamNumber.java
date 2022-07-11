import java.util.*;
class A
{
	int n,i,x,y;
	double sq1,sq2;
	int rev=0;
	int sq1rev=0;
	public A (int x)
	{
		n=x;
		function();	
	}
	public void function()
	{
		System.out.println("n="+n);
		sq1=Math.pow(n,2);
		x=(int)sq1;
		System.out.println("x="+x);
		for(i=0;x>0;i++)
		{
			sq1rev=sq1rev*10+(x%10);
			x/=10;
		}
		System.out.println("sq1rev="+sq1rev);
		for(i=0;n>0;i++)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		sq2=Math.pow(rev,2);
		y=(int)sq2;
		System.out.println("y="+y);
		System.out.println("sq1rev="+sq1rev);
		if(sq1rev==y)
			System.out.println("Adam number");
		else
			System.out.println("Non Adam number");
				
	}
	
}
class AdamNumber
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=t.nextInt();	
		A m=new A(n);
	}
}