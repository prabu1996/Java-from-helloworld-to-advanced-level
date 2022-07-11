import java.lang.*;
public class indexOfExample1
{
	public static void main(String arg[])
	{
		String str ="this was index of example";
		System.out.println(str.indexOf("this"));
		System.out.println(str.indexOf("was"));
		System.out.println(str.indexOf("index"));
		System.out.println(str.indexOf("of"));
		System.out.println(str.indexOf("example"));
		
		System.out.println(str.indexOf("was",4));
	}
}