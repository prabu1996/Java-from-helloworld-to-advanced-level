// Write a Java program to get the first and last occurrence of the specified elements in a linked list.
import java.util.*;
class Excercise10
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Four");		
		list.add(2,"Three");
		list.add(0,"Zero");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}