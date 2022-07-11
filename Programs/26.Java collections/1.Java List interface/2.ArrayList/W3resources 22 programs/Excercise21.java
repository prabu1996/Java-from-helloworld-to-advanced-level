import java.util.*;
class Excercise21
{
	public static void main(String arg[])
	{
		ArrayList<String> colors=new ArrayList<String>(5);
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
		System.out.println(colors);
		colors.set(0,"Pink");
		System.out.println(colors);
	}
}