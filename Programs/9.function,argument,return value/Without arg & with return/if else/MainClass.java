import java.util.*;
class SubClass
{
	int n;
	String a;
	public String function()
	{
		if (n%2==0)
			 a="Given n is Even number";
		else 
			 a="Given n is odd number";
		return a;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your number");
		n=t.nextInt();
	}
	public void display()
	{
		getInput();
		System.out.println(function());
	}
}
class MainClass
{
	SubClass m=new SubClass();
	m.display();
}