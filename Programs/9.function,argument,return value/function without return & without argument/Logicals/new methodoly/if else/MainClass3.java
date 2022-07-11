import java.util.*;
class SubClass
{
	int n;
	public void function()
	{
		if(n%2==0)
			System.out.println("Given num is even");
		else
			System.out.println("Given num is odd");	
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter number");
		n=t.nextInt();
		function();
	}
}
class MainClass3
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.getInput();
	}
}