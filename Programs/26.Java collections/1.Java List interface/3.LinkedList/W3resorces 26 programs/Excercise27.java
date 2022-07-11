//Write a Java program to replace an element in a linked list.
import java.util.*;
class Excercise27
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
		list.set(0,"ZERO ilada Heroda");
		System.out.println(list);
	}
}