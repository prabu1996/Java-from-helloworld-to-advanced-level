import java.util.*;
class SubClass
{
	int n,x,i;
	String y="";
	public String function()
	{
		for(i=0;n>0;i++)
		{
			x=n%2;
			y=x+y;
			n/=2;
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
		System.out.println("Equivalent binary value="+function());
	}
}
class DecimalToBinary3
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}