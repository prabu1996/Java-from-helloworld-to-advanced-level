import java.util.*;
class Exercise14
{
	public static void main(String arg[])
	{
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		System.out.println(colors); //know the diff bet print and lamda function
		colors.forEach(a->{System.out.println(a);});
		Collections.swap(colors,0,3);
		System.out.println(colors);
		colors.forEach(a->{System.out.println(a);});
	}
}