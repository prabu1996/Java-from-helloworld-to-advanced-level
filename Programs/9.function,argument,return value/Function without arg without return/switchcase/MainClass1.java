import java.util.*;
class SubClass
{
	char operation;
	int a,b;
	public void function()
	{
		switch (operation)
		{
			case '+':	System.out.println("a+b="+(a+b));
					break;
			case '-':	System.out.println("a-b="+(a-b));
					break;
			case '*' :	System.out.println("a*b="+(a*b));
					break;
			case '/' :	System.out.println("a/b="+(a/b));
					break;
			default :	System.out.println("Check your code");
					
		} 	
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("ENter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		System.out.println("Operation needs to perform");
		operation=t.next().charAt(0);
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