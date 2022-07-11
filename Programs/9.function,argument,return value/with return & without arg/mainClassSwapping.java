import java.util.*;
class SubClass
{
	int a,b,c,i;
	public int subMethod()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		System.out.println("Enter c");
		c=t.nextInt();
		i=a;
		a=b;
		b=c;
		c=i;
		return a;
		return b;
		return c;
	}
}
class mainClassSwapping
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();	
		int u=m.subMethod();
		int v=m.subMethod();
		int w=m.subMethod();
		System.out.println("a="+u);
		System.out.println("b="+v);
		System.out.println("c="+w);	
	}
}