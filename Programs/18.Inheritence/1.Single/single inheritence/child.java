import java.util.*;
class Parent
{
	int a,b,c;
	public Parent(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void function()
	{
		 int c=a+b;
		 this.c=c;
		 System.out.println("c="+c);
	}
}
class Child extends Parent
{
	public Child(int a,int b)
	{
		super(a,b);
	}
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("enter a,b");
		int a=t1.nextInt();
		int b=t1.nextInt();
		Child t2=new Child(a,b);
		t2.function();
		
	}
}