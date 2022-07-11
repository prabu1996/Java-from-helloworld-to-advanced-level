import java.util.*;
class OctToBin
{
	public OctToBin()
	{

	}
	public static void main(String arg[])	
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enbter octal number");
		String oct=t.next();
		int len=oct.length();
		int dec=0;
		String bin="";
		for(int i=0;i<len;i++)
		{
			dec=dec*8+Character.getNumericValue(oct.charAt(i));
		}
		for(int i=0;dec>0;i++)
		{
			bin=dec%2+bin;
			dec/=2;
		}
		System.out.println("Equivalent binary value="+bin);
	}
}