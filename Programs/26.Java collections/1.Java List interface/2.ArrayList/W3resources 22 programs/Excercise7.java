import java.util.*;
class Excercise7
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
		if(colors.contains("red"))
		{
			System.out.println("ArrayList contains red color");
		}
		else
		{
			System.out.println("ArrayList doesnot contains red color");
		}
	}
}