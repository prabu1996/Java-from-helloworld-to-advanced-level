import java.util.*;
class SubClass
{
	int a,b,z,x,y;
	public int function(int x,int y)
	{
		z=x+y;
		return z;
	}
	public void func()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		int a=t.nextInt();
		System.out.println("Enter b");
		int b=t.nextInt();
		function(a,b);
	}
	public void display()
	{
		func();
		System.out.println("sum of a&b is="+function(x,y));
	}
}
class MainClassAdd4
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		//m.func();
		m.display();
	}
}