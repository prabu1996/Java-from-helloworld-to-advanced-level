//Write a Java program to convert a linked list to array list.
import java.util.*;
class Excercise23
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		System.out.println("LinkedList: "+list);
		List<String> list2=new ArrayList<String>(list);
		System.out.println("ArrayList: "+list2);
	}
}