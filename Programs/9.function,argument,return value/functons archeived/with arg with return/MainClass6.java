import java.util.*;
class SubClass
{
	int i,n;
	String rev="";
	public String function(int a)
	{
		for(i=0;a>0;i++)
		{
			rev+=(a%10);
			a/=10;	
		}
		return rev;
	}
	public void  getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter number to be reversed");
		n=t.nextInt();
	}	
	public void display()
	{
		getInput();
		System.out.println("Reversed number="+ function(n));	
	}	
}
class MainClass6
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}