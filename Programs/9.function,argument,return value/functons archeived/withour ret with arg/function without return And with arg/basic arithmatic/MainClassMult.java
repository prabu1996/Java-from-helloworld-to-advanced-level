import java.util.*;
class SubClass
{
	int a,b,c;
	public void function(int x,int y)
	{
		c=a*b;	
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		function(a,b);
	}
	public void display()
	{
		getInput();
		System.out.println("mult of a&b is="+c);	
	}
}
class MainClassMult
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}