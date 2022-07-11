import java.util.*;
class Sub
{
	int a,b,c;
	public void swap()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		System.out.println("Enter c");
		c=t.nextInt(); 
		int d=a;
		a=b;
		b=c;
		c=d;
		
	}
	public void display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c"+c);	
	}
}
class MainSwapping
{
	public static void main(String arg[])
	{
		Sub m=new Sub();
		m.swap();
		m.display();		
	}
}