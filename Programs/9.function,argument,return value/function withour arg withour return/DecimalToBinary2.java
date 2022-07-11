import java.util.*;
class SubClass
{
	int n,i,y;
	String x="";
	public void function(int z)
	{
		for(i=0;z>0;i++)
		{
			y=z%2;
			x=y+x;
			z/=2;
		}
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter decimal number");
		n=t.nextInt();
		function(n);
	}
	public void display()
	{
		getInput();	
		System.out.println("Equivalent binary value="+x);
	}	
}
class DecimalToBinary2
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}