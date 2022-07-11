import java.io.*;
class TestNumberInWords
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a;
			System.out.println("for numbers only from 0 to 5 ");
			System.out.println("enter your number");
			a=Integer.parseInt(t.readLine());
			switch(a)
			{
				case 0:	System.out.println("Zero");
					break;
				case 1:	System.out.println("one");
					break;
				case 2:	System.out.println("Two");
					break;
				case 3:	System.out.println("Three");
					break;
				case 4:	System.out.println("Four");
					break;
				case 5:	System.out.println("Five");
					break;
				default:	System.out.println("check input");
			}
		}
		catch (Exception e)
		{
		  System.out.println(e);
		}
		System.out.println("Like this we can write for as many numbers we want"); 
	}
}