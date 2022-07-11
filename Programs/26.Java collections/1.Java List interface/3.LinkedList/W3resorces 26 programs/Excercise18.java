//Write a Java program to clone an linked list to another linked list. 
import java.util.*;
class Excercise18
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Zero");
		list.add("One");
		list.add("Two");		
		list.add("Three");
		list.add("Four");
		System.out.println("List1: "+list);
		LinkedList<String> list2=new LinkedList<String>();
		System.out.println("List2: "+list2);
		list2=(LinkedList<String>)list.clone();
		System.out.println("After clone,List2: "+list2);
	}
}