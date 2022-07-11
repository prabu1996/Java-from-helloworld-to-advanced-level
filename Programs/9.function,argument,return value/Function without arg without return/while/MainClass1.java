import java.util.*;
class SubClass
{
	int i,n;
	public void function()
	{
		i=1;
		while(i<n+1)
		{
			System.out.println(i);
			i++;
		}	
	}
	public void display()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("upto which natural number u want to print");
		n=t.nextInt();
		function();
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