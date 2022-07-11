// Write a Java program to insert some elements at the specified position into a linked list.
import java.util.*;
class Excercise9
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Four");		
		list.forEach(a->{System.out.println(a);});
		list.add(2,"Three");
		list.add(0,"Zero");
		list.forEach(a->{System.out.println(a);});
	}
}