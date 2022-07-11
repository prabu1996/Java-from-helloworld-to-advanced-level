import java.util.*;
class B
{
	public String function(int y)
	{
		int z,i,q,s;
		String c;
		s=1;
		z=1;
		q=1;
		double a=Math.pow(y,2);
		for(i=0;z>0;i++)
		{
			z=y%10;
			q=z*s;
			s=s*10;
			y/=10;
				
		}
		double b=Math.pow(q,2);
		if(a==b)
			c="Adam number";
		else 
			c="Adam number";
		return c;	
	}
}
class A
{
	public static void main(String arg[])
	{
		B p=new B();
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your number");
		int x=t.nextInt();
		System.out.println(p.function(x));	
	}
}