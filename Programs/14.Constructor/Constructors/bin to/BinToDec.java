import java.util.Scanner;
class BinToDec
{
	public BinToDec()
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
			if(Character.getNumericValue(bin.charAt(i))==0)
				dec=dec*2+0;
			else 
				dec=dec*2+1;
		}
		System.out.println("Equivalent decimal number="+dec);			
	}
}