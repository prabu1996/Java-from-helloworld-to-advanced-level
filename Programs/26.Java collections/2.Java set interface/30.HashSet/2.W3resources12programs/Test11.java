// Write a Java program to compare two sets and retain elements which are same on both sets.
import java.util.*;
class Test11
{
	public static void main(String arg[])
	{
		HashSet<String> set1=new HashSet<String>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");	
		
		HashSet<String> set2=new HashSet<String>();
		set2.add("One");
		set2.add("Orange");
		set2.add("Three");
		
		set1.retainAll(set2);
		System.out.println(set1);
	}
}