// Write a Java program to "iterate" through all elements in a linked list
import java.util.*;
class Excercise2
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Three");
		list.add("Two");
		list.forEach(a->{System.out.println(a);});
		
	}
}