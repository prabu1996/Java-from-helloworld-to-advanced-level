import java.util.*;
class Parent
{
	int a,b;
	public 	Parent(int a,int b)
	{
		this.a=a;
		this.b=b;	
	}
			
}
class Child extends Parent
{
	public Child(int a,int b)
	{
		super(a,b);	
	}
	public void function()
	{
		a=a+b;
		b=a-b;
		a=a-b;
	}
	public void display()
	{
		System.out.println("after swapping a="+a);
		System.out.println("after swapping b="+b);
	}
}
class Swap
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter a&b resp");
		int a=t1.nextInt();
		int b=t1.nextInt();	
		Child t2=new Child(a,b);
		t2.function();
		t2.display();
	}
}
