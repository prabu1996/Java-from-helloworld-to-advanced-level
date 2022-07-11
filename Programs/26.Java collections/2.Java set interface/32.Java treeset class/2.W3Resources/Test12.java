//Write a Java program to retrieve and remove the first element of a tree set.
import java.util.*;
class Test12
{
	public static void main(String arg[])
	{
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(1);
		set.add(82);
		set.add(35);
		set.add(24);
		set.add(505);
		set.add(60);
		set.add(07);
		set.add(88);
		set.add(19);
		set.add(110);
		System.out.println("set: "+set);
		System.out.println("Remove first/lowest element : "+set.pollFirst());
		System.out.println("After removing lowest number: "+set);
	}
}