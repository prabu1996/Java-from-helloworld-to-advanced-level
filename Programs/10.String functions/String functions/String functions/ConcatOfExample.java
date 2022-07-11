import java.lang.*;
public class ConcatOfExample
{
	public static void main(String arg[])
	{
		String name1,name2,fname,name3;
		name1="prabu";
		name2="ayyappan";
		name3="pushpam";
		fname=name1.concat(name2);
		System.out.println(fname);
		System.out.println(name1.concat(name2).concat(name3));
		
	}
}