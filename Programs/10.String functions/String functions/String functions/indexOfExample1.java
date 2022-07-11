import java.lang.*;
public class indexOfExample1
{
	public static void main(String arg[])
	{
		String str ="this index is of example";
		int index1=str.indexOf("is");
		int index2=str.indexOf("of");
		int index3=str.indexOf("example");
		System.out.println(index1+" "+index2+" "+index3);
		int index4=str.indexOf("is",4);
		System.out.println(index4);
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('e'));
		
		
	}
}