import java.util.*;
class SubClass
{
	int n;
	public void function()
	{
		if(n>0)
			System.out.println("Given num is postive");
		if(n<0)
			System.out.println("Given num is negative");
		if(n==0)
			System.out.println("Given num is neutral");
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter number");
		n=t.nextInt();
		function();
	}
}
class MainClass2
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.getInput();
	}
}