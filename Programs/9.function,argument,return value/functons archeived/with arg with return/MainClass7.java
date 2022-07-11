import java.util.*;
class SubClass
{
	int x,y;
	String c;
	public String function(int a,int b)
	{
		if(a>b) 
			c="Biggest num is a";
		if(b>a)
			c="Biggest num is b";	
		if(a==b)
			c="both a&b are equal";
		return c;	
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter x");
		x=t.nextInt();
		System.out.println("Enter y");
		y=t.nextInt();
	}
	public void display()
	{
		getInput();
		System.out.println(function(x,y));
	}
}
class MainClass7
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();	
		m.display();
	}
}