import java.util.*;
class SubClass
{
	int age;
	String output;
	public String function(int x)
	{
		if(age>=18)
			output="Person is eligible to vote";
		else
			output="Person is not eligible to vote";	
		return output;
	}
	public void getInput()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your age");
		age=t.nextInt();	
	}
	public void display()
	{
		getInput();	
		System.out.println(function(age));
	}
}
class MainClass9
{
	public static void main(String arg[])
	{
		SubClass m=new SubClass();
		m.display();
	}
}

