import java.util.*;
class Parent
{
	int a,b,c;
	public Parent(int a,int b,int c)
	{
		this.a=a;	
		this.b=b;
		this.c=c;
	}
	public void function()
	{
		System.out.println("Parent class is working");	
	}
}
class Child extends Parent
{
	public Child(int a,int b,int c)
	{
		super(a,b,c);
	}
	public void display()
	{
		a+=b;
		b=a-b;
		a-=b;
		System.out.println("after swap a="+a);
		System.out.println("after swap b="+b);
		System.out.println("after swap c="+c);
	}
}
class Remainder
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=t1.nextInt();
		int b=t1.nextInt();
		int c=t1.nextInt();
		Child t2=new Child(a,b,c);
		t2.display();
		t2.function();
	}	
}