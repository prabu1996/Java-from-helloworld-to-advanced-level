import java.util.*;
class SubClass
{
	int n;
	String output;
	public void function(int x)
	{
		if(n%2==0)
			output="Given number is even";
		if(n%2!=0)
			output="Given number is odd";	
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your number");
		n=t.nextInt();
		function(n);
	}
	public void display()
	{
		getInput();
		System.out.println(output);	
	}
}
class MainClassOddOrEven
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}