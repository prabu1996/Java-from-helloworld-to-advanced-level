import java.util.*;
class ArrayListExample2
{
	public static void main(String arg[])
	{
		ArrayList<String> list=new ArrayList<String> (); //Creating arraylist 
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Guava");
		System.out.println(list);
		 //Traversing list through Iterator  
		Iterator itr=list.iterator(); //getting the Iterator 
		while(itr.hasNext())  //check if iterator has the elements
		{
			System.out.println(itr.next());  //printing the element and move to next
		}
	}
}