import java.io.*;
class TestDaysInAMonth
{
	public static void main(String arg[])
	{
	  try
	  {
	   	DataInputStream t=new DataInputStream(System.in);
		int Month;
		System.out.println("month-number");
		Month=Integer.parseInt(t.readLine());
		switch(Month)
		{
			case	1:	System.out.println(31);
					break;
			case	2:	System.out.println(29);
					break;
			case 	3:	System.out.println(31);
					break; 
			case 	4:	System.out.println(30);
					break;
			case 	5:	System.out.println(31);
					break;
			case	6:	System.out.println(30);
					break;
			case	7:	System.out.println(31);
					break;
			case 	8:	System.out.println(31);
					break; 
			case 	9:	System.out.println(30);
					break;
			case 	10:	System.out.println(31);
					break;
			case 	11:	System.out.println(30);
					break; 
			case 	12:	System.out.println(31);
					break;
			default	:		System.out.println("CHECK ");
						
		}
	 
	  }
	   catch (Exception e)
	   {
 	     System.out.println(e);
	   }
	}
}