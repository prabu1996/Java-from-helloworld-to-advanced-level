i dont know
import java.util.*;
class I
{
	int a,b,c;
	public I(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;	
	}
	public void function()
	{
		a=(a+b+c)-(a+c);
		b=(b+c)-b;
		//c=(a+b)/2;
		System.out.println("a="+a);	
		System.out.println("b="+b);
		System.out.println("c="+c);
	}	
}
class SwapWithout3
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a=t.nextInt();
		int b=t.nextInt();
		int c=t.nextInt();	
		I m=new I(a,b,c);
		m.function();
	}
}