import java.util.*;
class SubClass
{
	int x,y,z,d;
	public int function(int a,int b,int c)
	{
		d=a;
		a=b;
		b=c;
		c=d;
		return a;
		//return b;	
		//return c;	
		//return(a,b,c);	
	}	
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter x");
		x=t.nextInt();
		System.out.println("Enter y");
		y=t.nextInt();
		System.out.println("Enter z");
		z=t.nextInt();	
						
	}
	public void display()
	{
		getInput();
		System.out.println("After swapping a="+function(x,y,z));
		System.out.println("After swapping b="+function(y,z,x));
		System.out.println("After swapping c="+function(z,x,y));
	}
}
class MainClass5
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}