import java.util.*;
class Parent
{
	int n;
	public Parent(int n)
	{
		this.n=n;
				
	}
	public void function()
	{
		System.out.println("Parent class is accessed without creating seperate object"+n);
	}
}
class Child extends Parent
{
	int n;
	public Child(int n)
	{
		super(n);
		this.n=n;	
	}
	public void display()
	{
		if(n%100==0)
		{
			if(n%400==0)
				System.out.println("Leap year");		
			else 
				System.out.println("Non-Leapp year");
		}
		else if(n%4==0)
			System.out.println("Leap year");
		else 
			System.out.println("Non leap year");		
	}
}
class LeapYear
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter your year");
		int n=t1.nextInt();
		Child t2=new Child(n);
		t2.function();
		t2.display();
	}
}