import java.util.*;
class NumberForamtException
{
	public static void main(String arg[])
	{
		try
		{
			String name="prabu";
			int a=Integer.parseInt(name);
			System.out.println(a);
		}	
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Rest of the code");
		}
	}
}