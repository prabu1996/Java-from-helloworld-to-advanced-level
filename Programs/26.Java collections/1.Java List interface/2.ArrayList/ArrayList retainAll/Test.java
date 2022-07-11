import java.util.*;
class Test
{
	public static void main(String arg[])
	{
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Siva");
		list1.add("Anuth");
		list1.add("Nimi");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Siva");
		list2.add("Nimi");
		list2.add("Prabu");
		System.out.println("Before retainAll: "+list1);
		System.out.println("Before retainAll: "+list2);
		list1.retainAll(list2);	
		System.out.println("After retainAll: "+list1);
		System.out.println("After retainAll: "+list2);
	}
}