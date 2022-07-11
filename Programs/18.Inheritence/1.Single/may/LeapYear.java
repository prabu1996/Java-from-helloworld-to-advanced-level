import java.util.*;
class Parent
{
	int year;
	public Parent(int year)
	{
		this.year=year;
	}
	public void display()
	{
		System.out.println("Single inheritence");
	}
}
class Child extends Parent
{
	int year;
	public Child(int year)
	{
		super(year);
		this.year=year;		
	}
	public void logic()
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Leap year2");
				}
				else
					System.out.println("Non-leap year2");
			}
			else 
				System.out.println("Leap year1");
		}
		else
			System.out.println("Non-leap year1");	
	}
}
class LeapYear
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Input year");
		int year=t1.nextInt();
		Child t2=new Child(year);
		t2.logic();
		t2.display();
	}
}