import java.util.*;
class MainClassAdd3
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.fun();
		m.display();
	}
}
class SubClass
{
	int a,b,z;
	public void fun()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		function(a,b);
	}
	public void function(int x,int y)
	{
		z=x+y;
	}
	public void display()
	{
		System.out.println("sum="+z);
	}
}
