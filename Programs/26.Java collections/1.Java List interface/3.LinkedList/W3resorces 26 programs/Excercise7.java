// 7. Write a Java program to insert the specified element at the front of a linked list.
import java.util.*;
class Excercise7
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Four");
		//list.forEach(a->{System.out.println(a);});
		list.offerFirst("ZEro");
		list.forEach(a->{System.out.println(a);});
	}
}