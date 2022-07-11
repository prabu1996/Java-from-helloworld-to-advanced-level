import java.util.*;
class SubClass
{
	int a,b;
	public void function()
	{
		if(a<b)
			System.out.println("a is smaller than b");
		if(b<a)
			System.out.println("b is smaller than a");
		if(a==b)
			System.out.println("both a&b are equal");		
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter a");
		a=t.nextInt();
		System.out.println("ENter b");
		b=t.nextInt();
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