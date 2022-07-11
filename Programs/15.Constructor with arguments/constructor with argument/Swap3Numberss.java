import java.util.*;
class A
{
	int a,b,c,d;
	public A(int x,int y,int z)
	{ 
		a=x;
		b=y;
		c=z;			
	}
	public int function()
	{
		d=a;
		a=b;
		b=c;
		c=d;
		return a,b,c;
		//return b;
		//return c;	
	}
}
class Swap3Numberss
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a=t.nextInt();
		int b=t.nextInt();
		int c=t.nextInt();
		A m=new A(a,b,c);
		System.out.println(m.function());
		System.out.println(m.function());
		System.out.println(m.function());
		
	}
}