import java.util.*;
class SubClass
{
	int a,b,c;
	String output;
	public void function(int x,int y,int z)
	{
		if((x<y)&&(x<z))
			output="a is the smallest number";
		if((y<x)&&(y<z))
			output="b is the smallest number";
		if((z<x)&&(z<y))
			output="c is smallest number";
		if((a==b)&&(b==c))
			output="all are equal number";
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		System.out.println("Enter c");
		c=t.nextInt();
		function(a,b,c);
	}
	public void display()
	{
		getInput();
		System.out.println(output);
	}
}
class MainClassSmallestOf3
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}