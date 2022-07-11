// Write a Java program to insert the specified element at the specified position in the linked list.
import java.util.*;
class Excercise5
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Four");
		list.forEach(a->{System.out.println(a);});
		list.add(2,"Three");
		list.forEach(a->{System.out.println(a);});
		
	}
}