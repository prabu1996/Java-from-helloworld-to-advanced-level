import java.lang.*;
class formatOfExample
{
	public static void main(String arg[])
	{
		String name,sf1,sf2,sf3;
		name="prabu";
		System.out.println(name.format("my name is %s",name));
		sf1=String.format("my name is %s",name);
		sf2=String.format("%f",33.123);
		sf3=String.format("%33.10f",32.123);
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
	}
}