// Write a Java program to insert elements into the linked list at the first and last position
import java.util.*;
class Excercise6
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Four");
		//list.forEach(a->{System.out.println(a);});
		list.addFirst("Zero");
		list.addLast("Five");
		list.forEach(a->{System.out.println(a);});
	}
}