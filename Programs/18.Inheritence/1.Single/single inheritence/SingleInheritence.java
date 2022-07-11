import java.util.*;
class ParentClass
{
	protected int x,y;
	public ParentClass(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void display()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
	}
}
class Childclass extends ParentClass
{
	protected int c;
	public Childclass(int x,int y)
	{
		super(x,y);
	}
	public void operation()
	{
		c=x+y;
		System.out.println("Sum of two numbers="+c);
	}
}
	
class SingleInheritence
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter a ,b");
		int a=t1.nextInt();
		int b=t1.nextInt();
		Childclass t2=new Childclass(a,b);
		t2.display();
		t2.operation();	
	}
}
