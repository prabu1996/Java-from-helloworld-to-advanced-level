//Write a Java program to remove a specified element from a linked list
import java.util.*;
class Excercise12
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		//list.remove("Zero");
		list.remove(0);
		System.out.println(list);
		
	}
}