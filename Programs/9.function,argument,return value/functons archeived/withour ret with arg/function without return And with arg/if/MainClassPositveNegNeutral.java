import java.util.*;
class SubClass
{
	int n;
	String output;
	public void function(int x)	
	{
		if(n>0)
			output="Given num is positive";
		if(n<0)
			output="Given number is negative";	
		if(n==0)
			output="Given number is neutral";
	}		
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter number");
		n=t.nextInt();
		function(n);
	}
	public void display()
	{
		getInput();
		System.out.println(output);
	}
}
class MainClassPositveNegNeutral
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}