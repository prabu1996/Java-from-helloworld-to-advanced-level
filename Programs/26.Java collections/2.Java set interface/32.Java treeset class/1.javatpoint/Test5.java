//In this example, we perform various SortedSetSet operations.
import java.util.*;
class Test5
{
	public static void main(String arg[])
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Initialset: "+set);
		System.out.println("HeadSet: "+set.headSet("D"));
		System.out.println("SubSet: "+set.subSet("B","E"));
		System.out.println("TailSet: "+set.tailSet("D"));
	}
}