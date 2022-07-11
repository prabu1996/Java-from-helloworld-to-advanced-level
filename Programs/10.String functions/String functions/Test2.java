import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		String name="prabu";
		System.out.println("index");
		int n=t.nextInt();
		int c=name.codePointAt(n);
		char a=name.charAt(n);
		System.out.println("codepoint of"+a+"="+c);
	}
}