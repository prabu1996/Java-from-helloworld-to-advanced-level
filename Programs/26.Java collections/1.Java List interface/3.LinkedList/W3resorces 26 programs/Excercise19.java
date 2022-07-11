//Write a Java program to remove and return the first element of a linked list.
import java.util.*;
class Excercise19
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		System.out.println("At initial: "+list);
		System.out.println("Removed element: "+list.pop());
		System.out.println("After pop: "+list);
	}
}