import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your full name");
		String name=t.next();
		System.out.println("Enter index of element you need");
		int n=t.nextInt();
		char c=name.charAt(n);
		System.out.println("Element present in the index"+n+"="+c);
	}
}