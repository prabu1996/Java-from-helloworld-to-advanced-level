import java.util.*;
class Excercise12
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
		System.out.println("Mainlist: "+list1);
		List<String> list2=list1.subList(0,3);
		//List<String> list2=new ArrayList<String>();
		//list2=list1.subList(0,3);
		System.out.println("Sublist: "+list2);
		
	}
}