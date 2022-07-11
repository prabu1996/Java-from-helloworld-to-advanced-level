import java.util.*;
class SortArrayListInteger
{
	public static void main(String arg[])
	{
		ArrayList<Integer> list=new ArrayList<Integer> ();
		list.add(45);
		list.add(89);
		list.add(0);
		list.add(9);
		Collections.sort(list);
		for(int numbers:list)
		{
			System.out.println(numbers);
		}
	}
}