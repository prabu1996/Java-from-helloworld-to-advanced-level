import java.util.*;
class SubClass
{
	int n;
	String x;
	public String function(int a)
	{
		if (a%2==0)
			x="Given num is even";
		else 
			x="Given num is odd";
		return x;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter number");
		n=t.nextInt();
	}
	public void display()
	{
		getInput();
		System.out.println(function(n));	
	}
}
class MainClass8
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}