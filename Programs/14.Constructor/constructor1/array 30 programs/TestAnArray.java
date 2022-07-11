import java.util.*;
class TestAnArray
{
	public TestAnArray()
	{
		
	}	
	public static void main(String arg[])
	{
		int[] a={10,20,30,40,50};
		int len=a.length;
		int count=0;
		Scanner t=new Scanner(System.in);
		System.out.println("enter num u want to check for its presence");
		int num=t.nextInt();
		for(int i=0;i<len;i++)
		{
			if(a[i]==num)
				count+=1;
		}
		if(count>0)
			System.out.println("The num you are looking for is present in this array");
		else 
			System.out.println("The num you are looking for is not present in this array");
	}
}