import java.util.*;
class SubClass
{
	int n,m,i;
	String z="";
	public String function(int x,int y)
	{
		i=1;
		do
		{
			z=i+"*"+x+"="+(i*x);
			return z;
			display();
			i++;		
		}
		while(i<y+1);
		
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter n");
		n=t.nextInt();
		System.out.println("upto what u need table");
		m=t.nextInt();
		//function(n,m);
	}
	public void display()
	{
		System.out.println(function(n,m));
	}
}
class MainClass14
{
	public static void main(String arg[])
	{
		SubClass l=new SubClass();
		getInput();
		
	}
}