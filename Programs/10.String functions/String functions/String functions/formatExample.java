import java.lang.*;
public class formatExample
{
	public static void main(String arg[])
	{
		String name,sf1,sf2,sf3;
		name="prabu";
		sf1=String.format("name is %s",name);
		sf2=String.format("value is %f",32.33434);
		sf3=String.format("value is %32.12f",32.33434);
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3 );
		
	}
}