import java.util.Scanner;
class IndexOfAnArrayElement
{
	public IndexOfAnArrayElement()
	{
		
	}
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int len=a.length;
		Scanner t=new Scanner(System.in);
		System.out.println("Input your index needed array element");
		int x=t.nextInt();
		for(int i=0;i<len;i++)
		{
			if(a[i]==x)
			{	
				System.out.println("index of"+a[i]+"= "+i);
				break;
			}		
		}
	}
}