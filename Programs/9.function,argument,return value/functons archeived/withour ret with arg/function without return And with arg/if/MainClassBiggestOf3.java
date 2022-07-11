import java.util.*;
class SubClass
{
	int n;
	String output;
	public void function(int x,int y,int z)
	{
		if((x>y)&&(x>z))
			output="a is the biggest number";
		if((y>x)&&(y>z))
			output="b is the biggest number";
		if((z>x)&&(z>y))
			output="c is the biggest number";
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		int a=t.nextInt();
		System.out.println("Enter b");
		int b=t.nextInt();
		System.out.println("Enter c");		
		int c=t.nextInt();
		function(a,b,c);
	}
	public void display()
	{
		getInput();
		System.out.println(output);
	}
}
class MainClassBiggestOf3
{
	public static void main(String arg[])	
	{
		SubClass m=new SubClass();
		m.display();
	}
}