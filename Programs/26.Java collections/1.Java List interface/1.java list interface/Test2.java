//Let's see a simple example to convert array elements into List.
import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		String[] array={"One","Two","Three","Four"};
		List<String> list=new ArrayList<String>();
		for(String numbers:array)
		{
			list.add(numbers);
		}
		//System.out.println("Arrays: "+array);
		System.out.println("Arrays: "+Arrays.toString(array));	
		System.out.println("List: "+list);
	}
}