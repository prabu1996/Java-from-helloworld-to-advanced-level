import java.util.*;
class A
{
	int a,b;
	public  A(int x,int y)
	{
		a=x;
		b=y;		
	}
	public void Addition()
	{
		int sum=a+b;
		System.out.println("Sum of a&b="+sum);	
	}
	public int Substraction()
	{
		int sub=a-b;
		return sub;
	}
}
class ArithematicOperations
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		int a=t.nextInt();
		System.out.println("Enter b");
		int b=t.nextInt();
		A m=new A(a,b);
		m.Addition();
		System.out.println("Sub of a&b="+m.Substraction());
	}
}