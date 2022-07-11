import java.util.*;
class SubClass
{
	int n,i,x;
	String y="";
	public void function(int m)
	{
		for(i=0;m>0;i++)
		{
			x=m%8;
			y=x+y;
			m/=8;
		}
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter decimal value");
		n=t.nextInt();
		function(n);
	}
	public void display()
	{
		getInput();
		System.out.println("Equivalent octal value="+y);
	}
}
class DecimalToOctal2
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}