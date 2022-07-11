import java.util.*;
class SubClass
{
	int a,b;
	String small;
	public void function(int x,int y)
	{
		if(a<b)
			small="a is smaller than b";
		if(b<a)
			small="b is smaller than a";		
		if(a==b)
			small="both a&b are equal";
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		function(a,b);	
	}
	public void display()
	{
		getInput();
		System.out.println(small);
	}
}
class MainClassSmallestOfTwo
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}	
}