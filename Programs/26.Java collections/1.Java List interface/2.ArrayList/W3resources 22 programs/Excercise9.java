import java.util.*;
class Excercise9
{
	public static void main(String arg[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		System.out.println("Before: "+list1);
		System.out.println("Before: "+list2);
		Collections.copy(list1,list2);
		System.out.println("After: "+list1);
		System.out.println("After: "+list2);
	}
}