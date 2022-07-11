import java.lang.*;
public class startsWithExample2
{
	public static void main(String arg[])
	{
		String str="prabu ayyappan";
		System.out.println(str.startsWith("j"));
		System.out.println(str.startsWith("p"));
		System.out.println(str.startsWith("r",1));
		System.out.println(str.startsWith(" ",5));
		System.out.println(str.startsWith("y",8));
		System.out.println(str.startsWith("y",7));
	}
}