import java.util.*;
class Excercise19
{
	public static void main(String arg[])
	{
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
		System.out.println(colors);
		colors.trimToSize();
		System.out.println(colors);
	}
}