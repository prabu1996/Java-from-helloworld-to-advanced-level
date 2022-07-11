class Test20
{
	public static void main(String arg[])
	{
		int n,i,j,dup,count;
		int[] a={10,20,30,10,30};
		n=a.length;
		for(i=0;i<n-1;i++)
		{
			count=0;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])	
					count+=1;
			}
			if(count>0)
				System.out.println("dup element is"+a[i]);	
		}
		
	}
}