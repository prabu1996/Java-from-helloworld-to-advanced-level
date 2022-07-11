import java.util.*;
class Excercise3
{
	public static void main(String arg[])
	{
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("red");
		colors.add("Green");
		colors.add("Yellow");
		System.out.println(colors);
		colors.add(0,"white");
		colors.add(4,"Black");
		System.out.println(colors);
	}
}