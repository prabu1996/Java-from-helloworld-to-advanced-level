import java.util.*;
class Sum 
{
	public int add(int x,int y)
	{
		int z=x+y;
		return z;
	}
}
class TestAdd
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		int a=t.nextInt();
		System.out.println("Enter b");
		int b=t.nextInt();
		Sum m=new Sum();
		int d=m.add(a,b);
		System.out.println("addition="+d);	
	}
}