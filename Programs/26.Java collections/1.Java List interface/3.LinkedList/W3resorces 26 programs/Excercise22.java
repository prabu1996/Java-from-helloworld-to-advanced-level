//Write a Java program to check if a particular element exists in a linked list.
import java.util.*;
class Excercise22
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		System.out.println(list.contains("One"));
		System.out.println(list.contains("Five"));
	}
}