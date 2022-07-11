import java.util.*;
class Excercise6
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
		//colors.remove("Red");
		colors.remove(0);
		System.out.println(colors);
	}
}