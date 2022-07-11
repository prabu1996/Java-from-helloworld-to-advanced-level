//Write a Java program to empty an hash set.
import java.util.*;
class Test4
{
	public static void main(String arg[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		System.out.println(set);
		set.clear();
		System.out.println(set);
	}
}