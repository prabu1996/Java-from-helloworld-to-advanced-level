import java.util.*;
class A
{
	int c;
	public A()
	{
		System.out.println("Default constructor");
	}
	public A(int x,int y)
	{
		c=x+y;
		System.out.println(c);			
	}
}
class MainClassEx
{
	public static void main(String arg[])
	{
		A m=new A();
		A q=new A(10,20);
		
	}
	
}