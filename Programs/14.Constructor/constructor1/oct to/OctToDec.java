import java.util.*;
class OctToDec
{
	public OctToDec()
	{
	}
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter octal number");
		String oct=t.next();
		int len=oct.length();
		int dec=0;
		for(int i=0;i<len;i++)
		{
			dec=dec*8+Character.getNumericValue(oct.charAt(i));
		}
		System.out.println("Equivalent decimal number="+dec);	
	}
}