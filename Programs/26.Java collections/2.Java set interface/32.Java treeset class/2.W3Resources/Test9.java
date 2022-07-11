//Write a Java program to find the numbers less than 7 in a tree set.
import java.util.*;
class Test9
{
	public static void main(String arg[])
	{
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		System.out.println(set.headSet(7));
	}
}