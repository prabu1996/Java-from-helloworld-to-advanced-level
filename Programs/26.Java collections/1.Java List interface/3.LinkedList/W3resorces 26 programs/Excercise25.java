//Write a Java program to test an linked list is empty or not.
import java.util.*;
class Excercise25
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());
	}
}