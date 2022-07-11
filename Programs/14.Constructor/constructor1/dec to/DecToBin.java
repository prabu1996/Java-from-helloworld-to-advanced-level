import java.util.Scanner;
class DecToBin
{
	public DecToBin()
	{
	
	}
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int dec=t.nextInt();
		String bin="";
		for(int i=0;dec>0;i++)
		{
			int a=dec%2;
			bin=a+bin;
			dec/=2;
		}
		System.out.println("Equivalent binary number="+bin);	
	}
}