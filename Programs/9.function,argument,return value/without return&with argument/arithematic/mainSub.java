import java.util.*;
class Rectangle
{
	public void Sub(int l,int b)
	{
		int dif=l-b;
		System.out.println("Difference bet l&b= "+dif);
	}
}
class mainSub
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		int a=t.nextInt();
		System.out.println("Enter b");
		int b=t.nextInt();
		Rectangle m=new Rectangle();
		m.Sub(a,b);
	}
}+