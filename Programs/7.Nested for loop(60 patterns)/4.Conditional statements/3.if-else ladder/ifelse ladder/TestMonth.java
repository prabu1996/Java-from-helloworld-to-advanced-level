import java.io.*;
class TestMonth 
{
	public static void main(String arg[])
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			int month;
			System.out.println("enter month number");
			month=Integer.parseInt(t.readLine());
			if (month==1)
				System.out.println("january");
			else if(month==2)
				System.out.println("feb");
			else if (month==3)
				System.out.println("march");
			else if (month==4)
				System.out.println("april");
			else if (month==5)
				System.out.println("may");
			else if (month==6)
				System.out.println("june");
			else if (month==7)
				System.out.println("july");
			else if (month==8)
				System.out.println("aug");
			else if (month==9)
				System.out.println("sep");
			else if (month==10)
				System.out.println("oct");
			else if (month==1)
				System.out.println("nov");
			else if (month==12)
				System.out.println("dec");
			else 
				System.out.println("wrong input");	
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}