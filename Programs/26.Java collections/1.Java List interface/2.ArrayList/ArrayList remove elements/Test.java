import java.util.*;
class Test
{
	public static void main(String arg[])
	{
		ArrayList<String> list1=new ArrayList<String> ();
		System.out.println(list1);
		list1.add("Nimi");
		list1.add("Vicky");
		list1.add("Prabu");
		System.out.println(list1);
		list1.remove("Nimi");
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Mani");
		list2.add("JP");
		list1.addAll(list2);
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println(list1);
	}
}