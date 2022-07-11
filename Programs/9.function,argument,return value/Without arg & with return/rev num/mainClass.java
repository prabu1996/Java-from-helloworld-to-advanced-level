import java.util.*;
class SubClass
{
	int n,i,x;
	String rev="";
	public String function()
	{
		for(i=1;n>0;i++)
		{
			x=n%10;
			rev=rev+x;
			n/=10;
		}
		return rev;	
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
		System.out.println("Reversed num is="+function());
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}