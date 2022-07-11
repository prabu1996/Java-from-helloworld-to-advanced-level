import java.lang.*;
public class joinOfExample2
{
	public static void main(String arg[])
	{
		String date1,date2;
		date1=String.join("/","23","04","1996");
		System.out.println(date1);
		date2=String.join(":","23","04","1996");
		System.out.println(date2);
		
	}
}