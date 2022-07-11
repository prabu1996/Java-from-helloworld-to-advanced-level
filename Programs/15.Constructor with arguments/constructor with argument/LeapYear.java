doubt huh
import java.util.Scanner;
class I
{
	int year;
	public I(int x)
	{
		year=x;
	}
	public void function()
	{
		if(year%4==0)
		{
			if((year%100==0)&&(year%400==0))
				System.out.println("Leap year");
			else 
				System.out.println(" Non Leap year");	
		}
		else 
			System.out.println("Non Leap year");
	}
}
class LeapYear
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter year");
		int year=t.nextInt();
		I m=new I(year);
		m.function();	
	}
}