import java.util.*;
class SubClass
{
	int a,b,c,x;
	public int function()
	{
		x=a;
		a=b;
		b=c;
		c=x;
		//return (a,b,c);
		return a;
		//return b;
		//return c;	
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		System.out.println("Enter c");	
		c=t.nextInt();
		
	}
	public void display()
	{
		getInput();
		System.out.println("After swapping a="+function());
		System.out.println("After swapping b="+function());
		System.out.println("After swapping c="+function());
	}
}
class MainClass
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}