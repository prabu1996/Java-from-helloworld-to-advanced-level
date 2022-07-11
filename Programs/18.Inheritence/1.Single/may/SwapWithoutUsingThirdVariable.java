import java.util.*;
class SubClass
{
	int a,b;
	public void display()
	{
		Scanner t2=new Scanner(System.in);
		System.out.println("Enter a followed by b");
		a=t2.nextInt();
		b=t2.nextInt();
	}
}
class SwapWithoutUsingThirdVariable extends SubClass
{
	public static void main(String arg[])
	{
		SwapWithoutUsingThirdVariable t1=new SwapWithoutUsingThirdVariable();	
		t1.display();
		int x=t1.a;
		int y=t1.b;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap x="+x);
		System.out.println("After swap y="+y);	
	}
}