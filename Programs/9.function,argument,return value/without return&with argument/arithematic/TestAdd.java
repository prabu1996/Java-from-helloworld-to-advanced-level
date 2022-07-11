import java.util.*;
class TestAdd
{
	int a,b,c;
	public static void main(String arg[])
	{
		
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("enter b");
		b=t.nextInt();
		calc(a,b);
	}
	public void calc(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of x&y is="+c);
	}
}