import java.util.*;
class I
{
	int a,b,c;
	String s;
	public I(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;				
	}
	public void function()
	{
		if((a>b)&&(a>c))
			System.out.println("a is biggest among a b c");
		else if((b>a)&&(b>c))
			System.out.println("b is biggest among a b c");
		else 
			System.out.println("c is biggest among a b c");
			
	}	
}
class BiggestOf3Numbers
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a,b&c");
		int a=t.nextInt();
		int b=t.nextInt();
		int c=t.nextInt();
		I m=new I(a,b,c);
		m.function();		
	}
}
