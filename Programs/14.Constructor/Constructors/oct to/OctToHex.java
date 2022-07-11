import java.util.*;
class OctToHex
{
	public OctToHex()
	{

	}
	public static void main(String arg[])	
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter octal number");
		String oct=t.next();
		int len=oct.length();
		int dec=0;
		String hex="";
		for(int i=0;i<len;i++)
		{
			dec=dec*8+Character.getNumericValue(oct.charAt(i));
		}
		for(int i=0;dec>0;i++)
		{
			if(dec%16==10)
				hex="A"+hex;
			else if(dec%16==11)
				hex="B"+hex;
			else if(dec%16==12)
				hex="C"+hex;
			else if(dec%16==13)
				hex="D"+hex;
			else if(dec%16==14)
				hex="E"+hex;
			else if(dec%16==15)
				hex="F"+hex;
			else 
				hex=dec%16+hex;
			dec/=16;
		}
		System.out.println("Equivalent hexadecimal value="+hex);
	}
}