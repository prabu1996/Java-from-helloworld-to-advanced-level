import java.util.*;
class Parent2
{
	int a,b,c;
	public Parent2(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;	
	}
	public void display1()
	{
		System.out.println("Parent2 class is accessed without separate object="+(a+b+c));
	}
}
class Parent1 extends Parent2
{
	int a,b,c;
	public Parent1(int a,int b,int c)
	{
		super(a,b,c);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void display2()
	{
		System.out.println("Parent1 class is accessed without separate object="+(a+b+c));
	}
}
class Child extends Parent1
{
	int a=0;
	int b=0;
	int c=0;
	public Child(int a,int b,int c)
	{
		super(a,b,c);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void function()
	{
		a=a+b+c;
		c=a-(b+c);
		b=a-(b+c);
		a=a-(b+c);		
	}
	public void display()
	{
		System.out.println("after swap a="+a);
		System.out.println("after swap b="+b);
		System.out.println("after swap c="+c);
	}
}
class Swap
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter a,b & c");
		int a=t1.nextInt();
		int b=t1.nextInt();
		int c=t1.nextInt();
		Child t2=new Child(a,b,c);
		t2.display2();
		t2.display1();
		t2.function();	
		t2.display();
	}
}