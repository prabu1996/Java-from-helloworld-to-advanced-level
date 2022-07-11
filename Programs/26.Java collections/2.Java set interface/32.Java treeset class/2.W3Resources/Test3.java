// Write a Java program to add all the elements of a specified tree set to another tree set.
import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("Apple");
		set1.add("Orange");
		set1.add("Guava");
		System.out.println("Set1: "+set1);
		TreeSet<String> set2=new TreeSet<String>();
		set2.addAll(set1);
		System.out.println("Set2: "+set2);
	}
}