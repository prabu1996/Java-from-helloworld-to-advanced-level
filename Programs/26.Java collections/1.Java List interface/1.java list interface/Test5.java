// sort list elements
import java.util.*;
class Test5
{
	public static void main(String arg[])
	{
		List<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Jack");
		list.add("Banana");
		Collections.sort(list);
		Iterator obj=list.iterator();
		//while(obj.hasNext())
		//{
		//	System.out.println(obj.next());
		//}
		
		//for(String fruits:list)
		//{
		//	System.out.println(fruits);
		//}

		list.forEach(a->{System.out.println(a);});
	}
}