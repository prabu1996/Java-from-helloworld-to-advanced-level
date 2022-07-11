// Write a Java program to remove all of the elements from a hash set.
import java.util.*;
class Test12
{
	public static void main(String arg[])
	{
		HashSet<String> set1=new HashSet<String>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");	
		set1.clear();
		//set1.removeAll(set1);
		System.out.println(set1);
	}
}