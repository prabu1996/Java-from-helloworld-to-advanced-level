//Write a Java program to retrieve and remove the last element of a tree set.
import java.util.*;
class Test15
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
		System.out.println("Remove last/highest element : "+set.pollLast());
		System.out.println("After removing highest number: "+set);
	}
}