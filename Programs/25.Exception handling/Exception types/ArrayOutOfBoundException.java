import java.util.*;
class ArrayOutOfBoundException
{
	public static void main(String arg[])
	{
		try
		{
			int []a=new int[5];
			a[10]=55;
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Rest of the code");
		}
	}
}