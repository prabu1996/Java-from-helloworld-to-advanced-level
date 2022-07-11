import java.lang.*;
public class equalsIgnoreCaseOfExample
{
	public static void main(String arg[])
	{
		String name1,name2,name3,name4;
		name1="PRABU AYYAPPAN";
		name2="PRABU AYYAPPAN";
		name3="prabu ayyappan";
		name4="prabu abirami";
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.equalsIgnoreCase(name3));
		System.out.println(name1.equalsIgnoreCase(name4));
	}
}