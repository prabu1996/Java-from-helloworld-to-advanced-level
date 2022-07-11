import java.util.*;
class SubClass
{
	int temp;
	public void function()
	{
		if(temp<=0)
			System.out.println("it's freezing");
		else if((temp>0)&&(temp<=28))
			System.out.println("Normal temperature");
		else if((temp>28)&&(temp<=50))
			System.out.println("hot wheather");
		else
			System.out.println("too hot condition");
	}
	public void getData()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter temperature value");
		temp=t.nextInt();
		function();
	}
}
class MainClass1
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.getData();
	}
}