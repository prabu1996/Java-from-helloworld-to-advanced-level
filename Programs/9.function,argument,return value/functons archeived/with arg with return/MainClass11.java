import java.util.*;
class SubClass
{
	int n;
	String y="";
	String z=" ";
	int i=1;
	public String function(int a)
	{
		if(a%2==0)
			a--;	
		while(i<a+1)
		{	
			if(i%2!=0)
			{
				y+=i;
				y+=z;
			}
			i++;		
		}
		return y;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("ENter number");
		n=t.nextInt();
	}
	public void display()
	{
		getInput();
		System.out.println(function(n));
		
	}
}
class MainClass11
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}