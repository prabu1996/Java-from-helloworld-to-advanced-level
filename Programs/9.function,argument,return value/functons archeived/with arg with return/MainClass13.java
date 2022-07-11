import java.util.*;
class SubClass
{
	int n;
	String y="";
	String z=" ";
	public String function(int x)
	{
		if (x%2!=0)
			x--;
		int i=x;
		do
		{
			y+=i;
			y+=z;
			i=i-2;;
		}
		while(i>1);
		return y;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter num");
		n=t.nextInt();
	}
	public void display()
	{
		getInput();	
		System.out.println(function(n));
	}
}
class MainClass13
{
	public static void main (String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}