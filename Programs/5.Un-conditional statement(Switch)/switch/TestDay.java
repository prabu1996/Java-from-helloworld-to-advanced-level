import java.io.*;
class TestDay
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Daycode;
			System.out.println("enter your daycode");
			Daycode=Integer.parseInt(t.readLine());
			//System.out.println("give input in number");
			switch(Daycode)
			{
				case 1:	System.out.println("sunday");
					break;
				case 2:	System.out.println("monday");
					break;
				case 3:	System.out.println("Tuesday");
					break;
				case 4:	System.out.println("Wednesday");
					break;
				case 5:	System.out.println("Thursday");
					break;
				case 6:	System.out.println("Friday");
					break;
				case 7: 	System.out.println("Saturday");
					break;
				default:	System.out.println("check your input");
			}	
		}
		 catch (Exception e)
		{
			System.out.println(e);
		}
		
	System.out.println("input only inbet 1 to 7");
	}


}