//Write a Java program to retrieve but does not remove, the first element of a linked list.
import java.util.*;
class Excercise20
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		System.out.println(list.peekFirst());
		
	}
}