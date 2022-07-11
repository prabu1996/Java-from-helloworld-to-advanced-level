import java.util.*;
class SubClass
{
	int a,b,c;
	public int function()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		int a=t.nextInt();
		System.out.println("Enter b");
		int b=t.nextInt();
		c=a+b;
		return c;
	}
	public void display()
	{
		System.out.println("Sum is="+function());
	}
}
class MainClassAdd2
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}