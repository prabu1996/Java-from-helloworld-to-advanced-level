//Write a Java program to clone a tree set list to another tree set.
import java.util.*;
class Test6
{
	public static void main(String arg[])
	{
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("Apple");
		set1.add("Orange");
		set1.add("Guava");
		System.out.println("set1: "+set1);
		TreeSet<String> set2=(TreeSet<String>)set1.clone();
		System.out.println("set2: "+set2);
	}
}