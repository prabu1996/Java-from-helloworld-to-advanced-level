import java.util.*;
class NullPointerException
{
	public static void main(String arg[])	
	{
		try
		{
			String s=null;
			System.out.println(s.length());	
		}
		catch(Exception e)	
		{
			System.out.println(e);
			System.out.println("Rest of the code");		
		}
	}
}