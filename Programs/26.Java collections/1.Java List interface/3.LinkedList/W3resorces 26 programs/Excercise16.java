// Write a Java program to shuffle the elements in a linked list.
import java.util.*;
class Excercise16
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		System.out.println(list);
		System.out.println(" ");
		Collections.shuffle(list);
		System.out.println(list);
		
	}
}