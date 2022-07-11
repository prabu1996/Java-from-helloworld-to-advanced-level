import java.util.*;
class CustomMsgOnException
{
	public static void main(String arg[])
	{
		try
		{
			int a=100/0;
		}
		catch(Exception e)
		{
			System.out.println("Arithematic Exception number cant divided by zero");
		}		
	}
}
