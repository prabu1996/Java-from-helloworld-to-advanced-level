import java.util.*;
class SubClass
{
	int x,y,z,d;
	public void function(int x,int y,int z)
	{
		d=x;
		x=y;
		y=z;
		z=d;
		System.out.println("After swapping a="+x);	
		System.out.println("After swapping b="+y);
		System.out.println("After swapping c="+z);	
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		int a=t.nextInt();
		System.out.println("Enter b");
		int b=t.nextInt();
		System.out.println("Enter c");
		int c=t.nextInt();
		function(a,b,c);
	}
	public void display()
	{
		getInput();
		//System.out.println("After swapping a="+x);	
		//System.out.println("After swapping b="+y);
		//System.out.println("After swapping c="+z);
	}
}
class MainClassSwap
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}
