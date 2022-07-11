import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		System.out.println("Initial list of elements: "+list1);
		list1.add("Anuth");
		list1.add("Gokhul");
		list1.add("Jp");
		System.out.println("After initial adding of elements: "+list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Mani");
		list2.add("Mohanaprasanth");
		list2.add("Vicky");
		list1.addAll(list2);
		System.out.println(list1);
		list1.add(3,"Chinnasamy");
		System.out.println(list1);
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("Vetru");
		list3.add("Nimi");
		list3.add("Peer");
		list3.add("Prabu");
		list1.addAll(6,list3);
		System.out.println(list1);
	}
}