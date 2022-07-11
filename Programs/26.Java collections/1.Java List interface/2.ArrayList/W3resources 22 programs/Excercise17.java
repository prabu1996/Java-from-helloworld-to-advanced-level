import java.util.*;
class Excercise17
{
	public static void main(String arg[])
	{
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
		colors.set(0,"Pink");
		System.out.println(colors);
		colors.removeAll(colors);
		System.out.println(colors);
	}
}