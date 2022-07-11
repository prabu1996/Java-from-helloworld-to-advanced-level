import java.util.*;
class SubClass
{
	int n;
	String y="";
	String z=" ";
	public String function(int x)
	{
		int i=x;
		while(i>0)
		{
			y+=i;
			y+=z;
			i--;
		}
		return y;	
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter number");
		n=t.nextInt();
	}
	public void display()
	{
		getInput();
		System.out.println(function(n));	
	}
}
class MainClass12
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}