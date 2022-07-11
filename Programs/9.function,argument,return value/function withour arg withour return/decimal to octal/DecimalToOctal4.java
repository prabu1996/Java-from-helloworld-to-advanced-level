import java.util.*;
class SubClass
{
	int n,i,x;
	String y="";
	public String function(int m)
	{
		for(i=0;m>0;i++)
		{
			x=m%8;
			y=x+y;
			m/=8;
		}
		return y;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter decimal number");
		n=t.nextInt();		
	}
	public void display()
	{
		getInput();
		System.out.println("Equivalent octal value="+function(n));
	}
}
class DecimalToOctal4
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}