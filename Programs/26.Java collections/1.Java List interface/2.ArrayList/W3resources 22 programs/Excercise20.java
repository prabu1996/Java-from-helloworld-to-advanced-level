import java.util.*;
class Excercise20
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
		colors.ensureCapacity(7);
		colors.add("Pink");
		colors.add("Grey");
		System.out.println(colors);
	}
}