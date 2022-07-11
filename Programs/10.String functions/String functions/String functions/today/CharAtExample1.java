import java.lang.*;
public class CharAtExample1
{
	public static void main(String arg[])
	{
		String name;
		name="welcome to javapoint portal";
		int len=name.length();
		System.out.println(len);
		System.out.println(name.charAt(len-1));
	}
}