class Test21
{
	public static void main(String arg[])
	{
		int n,i,j,count,x;
		String[] a={"f","d","h","f","k"};
		n=a.length;
		x=0;
		for(i=0;i<n-1;i++)
		{
			count=0;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
					count+=1;
				else 
					x++;
			}
			if(count>0)
				System.out.println("dup string is "+ a[i]);
		}
		if(x==10)
			System.out.println("no duplicate string element in the array");
	}
}