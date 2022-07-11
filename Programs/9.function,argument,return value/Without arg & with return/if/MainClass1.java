import java.util.*;
class SubClass
{
	int a,b,big;
	public int function()
	{
		if(a>b)
			big=a;
		if(b>a)
			big=b;
		return big;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a");
		a=t.nextInt();
		System.out.println("Enter b");
		b=t.nextInt();
		
	}
	public void display()
	{
		getInput();
		System.out.println("Biggest num is="+function());
	}
}
class MainClass1
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}