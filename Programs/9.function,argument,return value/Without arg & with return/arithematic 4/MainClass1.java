import java.util.*;
class SubClass
{
	int a,b,c;
	public int function()
	{
		c=a+b;
		return c;
			
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");	
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		display();
	}
	public void display()
	{
		System.out.println("sum of a&b is="+function());
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