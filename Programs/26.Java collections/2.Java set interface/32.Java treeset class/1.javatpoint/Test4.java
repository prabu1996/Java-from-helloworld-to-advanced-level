//In this example, we perform various NavigableSet operations.
import java.util.*;
class Test4
{
	public static void main(String arg[])
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initial set: "+set);
		System.out.println("HeadSet: "+set.headSet("C",true));
		System.out.println("Tailset: "+set.tailSet("C",false));
		System.out.println("Subset: "+set.subSet("A",false,"E",false));	
		System.out.println("Reverse set: "+set.descendingSet());
	}
}