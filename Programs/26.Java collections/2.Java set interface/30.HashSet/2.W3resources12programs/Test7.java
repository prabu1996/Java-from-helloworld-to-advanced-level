// Write a Java program to clone a hash set to another hash set.
import java.util.*;
class Test7
{
	public static void main(String arg[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		
		HashSet<String> set2=new HashSet<String>();
		set2=(HashSet)set.clone();
		System.out.println(set2);
		
	}
}