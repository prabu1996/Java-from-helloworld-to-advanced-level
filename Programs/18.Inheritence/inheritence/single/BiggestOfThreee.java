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
		System.out.println("Parent class is accessed without creating seperate object");
	}
}
class Child extends Parent
{
	int a,b,c;
	public Child(int a,int b,int c)
	{
		super(a,b,c);
		this.a=a;
		this.b=b;
		this.c=c;	
	}
	public void logic()
	{
		if((a>b)&&(a>c))
			System.out.println("a is the biggest number");	
		else if((b>a)&&(b>c))
			System.out.println("b is the biggest number");
		else 
			System.out.println("c is the biggest number");
	}
	
}
class BiggestOfThreee
{	
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a=t1.nextInt();
		int b=t1.nextInt();
		int c=t1.nextInt();
		Child t2=new Child(a,b,c);
		t2.function();
		t2.logic();	
	}
}
