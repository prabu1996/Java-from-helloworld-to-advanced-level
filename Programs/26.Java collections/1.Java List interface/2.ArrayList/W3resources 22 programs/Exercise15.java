import java.util.*;
class Exercise15
{
	public static void main(String arg[])
	{
		ArrayList<String> colors1=new ArrayList<String>();
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Yellow");
		colors1.add("Black");
		System.out.println("Colors1: "+colors1); 
		ArrayList<String> colors2=new ArrayList<String>();
		colors2.add("White");
		colors2.add("Orange");
		colors2.add("Pink");
		System.out.println("Colors2: "+colors2); 
		colors1.addAll(colors2);
		System.out.println("After Colors1: "+colors1);
		System.out.println("After Colors2: "+colors2); 
	}
}