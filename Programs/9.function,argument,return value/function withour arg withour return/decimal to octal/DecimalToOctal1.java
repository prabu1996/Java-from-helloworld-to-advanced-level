import java.util.*;
class SubClass
{
	int n,i,x;
	String y="";
	public void function()
	{
		for(i=0;n>0;i++)
		{
			x=n%8;
			y=x+y;
			n/=8;	
		}
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter n");
		n=t.nextInt();
		function();
	}
	public void display()
	{
		getInput();
		System.out.println("Equivalent octal value="+y);
	}
}
class DecimalToOctal1
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}