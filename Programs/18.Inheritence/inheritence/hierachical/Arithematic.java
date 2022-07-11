import java.util.*;
class A
{
	int a,b,c;
	public A(int a,int b)
	{
		this.a=a;
		this.b=b;	
	}
	public void Add()
	{
		c=a+b;
		System.out.println("Sum of two nums="+c);
	}
	public void Sub()
	{
		c=a-b;
		System.out.println("Sub of two nums="+c);	
	}		
	
}
class B extends A
{
	public B(int a,int b)
	{
		super(a,b);
	}
	public void display2()
	{
		System.out.println("2nd  inheritence");	
	}
}
class C extends A
{
	public C(int a,int b)
	{
		super(a,b);
	}
	public void display1()
	{
		System.out.println("1st inheritence");	
	}
}
class Arithematic
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter a follwed by b ");
		int a=t1.nextInt();
		int b=t1.nextInt();
		C t2=new C(a,b);
		t2.Add();
		t2.display1();
		B t3=new B(a,b);
		t3.Sub();
		t3.display2();
	}
}