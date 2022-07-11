import java.util.*;
class A
{
	int[] a;
	int n;
	public A(int[] x,int y)
	{
		a=x;
		n=y;		
	}
	public void FindDuplicateElements()
	{
		for(int i=0;i<n-1;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
					count+=1;
				
			}
			System.out.println("count="+count);
			if(count>0)
				System.out.println("Duplicate element is="+a[i]);	
			else if(count>1)
			{
				
			}
				System.out.println("No Duplicate elements found");
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
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("a["+i+"]=");
			a[i]=t.nextInt();
		}
		A m=new A(a,n);
		m.FindDuplicateElements();
		
	}
}