// Write a Java program to convert a hash set to a List/ArrayList.
import java.util.*;
class Test9
{
	public static void main(String arg[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");	
		List<String> list=new ArrayList<String>(set);	
		System.out.println("HashSet: "+set);
		System.out.println("List: "+list);
	}
}