import java.util.*;
class SubClass
{
	int n,i,y;
	String x="";
	public void function()
	{
		for(i=0;n>0;i++)
		{
			y=n%2;
			x=y+x;
			n=n/2;	
		}		
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter decimal number");
		n=t.nextInt();
		function();
	}
	public void display()
	{
		getInput();	
		System.out.println(x);
	}
}
class DecimalToBinary
{
	public static void main(String arg[])
	{
		SubClass m=n ew Su  bClass();
		m.display(); 
	} 
}