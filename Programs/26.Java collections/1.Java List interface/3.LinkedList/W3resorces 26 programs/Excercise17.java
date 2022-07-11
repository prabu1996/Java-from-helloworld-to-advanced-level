//Write a Java program to join two linked lists.
import java.util.*;
class Excercise17
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Red");
		list2.add("Green");
		list2.add("Violet");
		list.addAll(list2);
		System.out.println("List1: "+list);
		System.out.println("List2: "+list2);
		System.out.println("After joining,List1: "+list);
	}
}