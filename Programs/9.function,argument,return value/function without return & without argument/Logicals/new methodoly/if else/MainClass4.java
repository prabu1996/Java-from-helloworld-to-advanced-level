import java.util.*;
class SubClass
{
	int age;
	public void function()
	{
		if(age>=18)
			System.out.println("person is eleigible to vote");
		else 
			System.out.println("Person is not eliegible to vote");
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("enter age of the person");
		age=t.nextInt();
		function();
	}
}
class MainClass4
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.getInput();
	}
}