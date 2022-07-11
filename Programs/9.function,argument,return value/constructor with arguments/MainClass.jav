import java.util.*;
class A
{
	int count=0;
	public A(int x)
	{
		int[] a=new int[x];
		for(int i=0;i<x;i++)
		{
			System.out.println("a["+i+"]=");
			a[i]=t.nextInt();
		}
	}
	public void FindDuplicateElements()
	{
		for(int i=0;i<x-1;i++)
		{
			for(int j=i+1;j<x;j++)
			{
				if(a[i]==a[j])
					count+=1;
			}
			if(count>0)
				System.out.println("Duplicate element is="+a[i]);	
		}
	}
}
class MainClass
{
	public static void main(String arg[])
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=t.nextInt();
		A m=new m(n);
		m.FindDuplicateElements();
		
	}
}