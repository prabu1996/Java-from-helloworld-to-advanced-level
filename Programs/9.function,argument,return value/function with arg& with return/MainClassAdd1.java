import java.util.*;
class SubClass
{
	int a,b,c;
	public void function()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		int a=t.nextInt();
		System.out.println("Enter b");
		int b=t.nextInt();
		c=a+b;	
	}
	public void display()
	{
		System.out.println("Sum is="+c);
	}
}
class MainClassAdd1
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.function();
		m.display();
	}
}