import java.util.*;
class Excercise22
{
	public static void main(String arg[])
	{
		ArrayList<String> colors=new ArrayList<String>(5);
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
		int n=colors.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(colors.get(i));
		}
	}
}