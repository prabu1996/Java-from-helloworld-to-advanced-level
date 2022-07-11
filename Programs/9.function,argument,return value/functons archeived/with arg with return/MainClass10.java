import java.util.*;
class SubClass
{
	int n,x;
	String y="";
	int i=1;
	public String function(int a)
	{
		while(i<a+1)
		{
			y+=i;
			i++;					
		}
		return y;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter number");
		n=t.nextInt();
	}
	public void display()
	{
		getInput();
		System.out.println(function(n));
	}
}
class MainClass10
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();	
		m.display();
	}
}