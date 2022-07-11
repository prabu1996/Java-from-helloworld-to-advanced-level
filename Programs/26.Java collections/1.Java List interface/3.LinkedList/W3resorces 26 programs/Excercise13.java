//Write a Java program to remove first and last element from a linked list
import java.util.*;
class Excercise13
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		//list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
	}
}