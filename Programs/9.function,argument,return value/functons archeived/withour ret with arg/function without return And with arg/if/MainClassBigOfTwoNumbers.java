import java.util.*;
class SubClass 
{
	String big;
	int a,b;
	public void function(int x,int y)
	{
		if(a>b)
			big="a is bigger than b";
		if(b>a) 
			big="b is bigger than a";
		if(a==b)
			big="Both a&b are equal";
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		function(a,b);
	}
	public void display()
	{
		getInput();
		System.out.println(big);
	}
}
class MainClassBigOfTwoNumbers
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}