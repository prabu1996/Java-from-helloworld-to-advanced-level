import java.util.*;
class Excercise2
{
	public static void main(String arg[])
	{
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
		colors.forEach(a->{System.out.println(a);}); //lamda function
	}
}