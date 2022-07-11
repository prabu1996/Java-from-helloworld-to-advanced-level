// Write a Java program to insert the specified element at the end of a linked list.
import java.util.*;
class Excercise8
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Four");
		//list.forEach(a->{System.out.println(a);});
		list.offerLast("THree");		
		list.forEach(a->{System.out.println(a);});
	}
}