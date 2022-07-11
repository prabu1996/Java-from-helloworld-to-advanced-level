import java.util.Scanner;
class BinToOct
{
	public BinToOct()
	{

	}
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter binary value");
		String bin=t.next();
		int len=bin.length();
		int dec=0;
		String oct="";
		for(int i=0;i<len;i++)
		{
			dec=dec*2+Character.getNumericValue(bin.charAt(i));	
		}
		for(int i=0;dec>0;i++)
		{
			oct=dec%8+oct;
			dec/=8;	
		}
		System.out.println("Equivalent octal value="+oct);	
	}
}