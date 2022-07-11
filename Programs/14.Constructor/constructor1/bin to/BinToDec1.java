import java.util.Scanner;
class BinToDec1
{
	public BinToDec1()
	{

	}
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your binary number");
		String bin=t.next();
		int len=bin.length();
		int dec=0;
		for(int i=0;i<len;i++)
		{
			dec=dec*2+Character.getNumericValue(bin.charAt(i));
		}
		System.out.println("Equivalent decimal number="+dec);			
	}
}