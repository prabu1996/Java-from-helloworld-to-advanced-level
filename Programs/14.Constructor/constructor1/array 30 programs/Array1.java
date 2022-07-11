import java.util.*;
class Array1
{
	public Array1()
	{

	}
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Array size");
		int n=t.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter valueof a["+i+"]");
			a[i]=t.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}