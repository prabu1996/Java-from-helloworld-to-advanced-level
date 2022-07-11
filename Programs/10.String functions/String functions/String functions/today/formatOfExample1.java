import java.lang.*;
public class formatOfExample1 
{
	public static void main(String arg[])
	{
		String  name,sf1,sf2,sf3,sf4,sf5;
		name="prabu";
		sf1=String.format("name is %s",name);
		sf2=String.format("%f",32.456);
		sf2=String.format("%d",32);
		System.out.println(sf1);
		System.out.println(sf2);
		
	}
}