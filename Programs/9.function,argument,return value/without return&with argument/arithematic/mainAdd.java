import java.util.Scanner;
class Rectangle
{
	public void Add(int x,int y)
	{
		int sum=x+y;
		System.out.println("sum="+sum);
	}
}
class mainAdd
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		Rectangle obj1=new Rectangle();
		obj1.Add(a,b);
	}
}