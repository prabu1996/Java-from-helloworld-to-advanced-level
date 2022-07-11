import java.util.*;
class SubClass
{
	int a,b,c;
	public void function()
	{
		if(a>=b)
		{
			if(a>=c)
				System.out.println("a is biggest among all");
		}
		else if(b>=a)
		{
			if(b>=c)
				System.out.println("b is biggest among all");
		
		}
		else if(c>=a)
		{ 
			if(c>=b)
				System.out.println("c is biggest among all");
		}
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		System.out.println("Enter c");
		c=t.nextInt();
		function();
	}
}
class MainClass1
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.getInput();	
	}
}