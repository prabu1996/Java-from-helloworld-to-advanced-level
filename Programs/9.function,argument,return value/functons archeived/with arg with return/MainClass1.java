import java.util.*;
class SubClass
{
	int x,y,c;
	public int function(int a,int b)
	{
		c=a+b;
		return c;		
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		x=t.nextInt();
		System.out.println("Enter b");
		y=t.nextInt();
	}
	public void display()
	{
		getInput();
		System.out.println("Sum of a&b is="+function(x,y));
	}
}
class MainClass1
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}