import java.util.*;
class RemoveASpecificElement
{
	public RemoveASpecificElement()
	{

	}
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int len=a.length;
		Scanner t=new Scanner(System.in);
		System.out.println("Element to be removed");
		int x=t.nextInt();
		for(int i=0;i<len;i++)
		{
			if(a[i]==x)
			{
				a[i]=a[len-1];
				len--;
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}	
	}
}