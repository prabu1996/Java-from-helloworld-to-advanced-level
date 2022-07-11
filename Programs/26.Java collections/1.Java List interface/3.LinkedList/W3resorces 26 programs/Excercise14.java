// Write a Java program to remove all the elements from a linked list. 
import java.util.*;
class Excercise14
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
		list.clear();
		System.out.println(list);
		
	}
}