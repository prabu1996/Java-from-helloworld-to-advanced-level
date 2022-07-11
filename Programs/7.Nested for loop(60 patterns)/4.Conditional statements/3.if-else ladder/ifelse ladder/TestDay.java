import java.io.*;
class TestDay 
{
	public static void main(String arg[]) 
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			int dayorder;
			System.out.println("dayorder?");
			dayorder=Integer.parseInt(t.readLine());
			if (dayorder==1)
				System.out.println("Sunday");
			else if (dayorder==2)
				System.out.println("Monday");
			else if (dayorder==3)
				System.out.println("Tuesday");
			else if (dayorder==4)
				System.out.println("Wednesday");
			else if (dayorder==5)
				System.out.println("Thursday");
			else if (dayorder==6)
				System.out.println("Friday");
			else if (dayorder==7)
				System.out.println("Saturday");
			else
				System.out.println("wrong input");	
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}