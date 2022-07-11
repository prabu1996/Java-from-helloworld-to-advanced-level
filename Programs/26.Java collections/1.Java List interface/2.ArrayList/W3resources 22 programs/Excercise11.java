import java.util.*;
class Excercise11
{
	public static void main(String arg[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		list1.add("6");
		System.out.println("Initially: "+list1);
		Collections.reverse(list1);
		System.out.println("After reverse: "+list1);
		
	}
}