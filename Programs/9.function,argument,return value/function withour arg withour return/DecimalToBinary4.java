import java.util.*;
class SubClass
{
	int n,x,i;
	String y="";
	public String function(int z)
	{

		for(i=0;z>0;i++)
		{
			x=z%2;
			y=x+y;
			z/=2;
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
		System.out.println("Eqiuvalent binary value="+function(n));
		
	}
}
class DecimalToBinary4
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();		
	}
}