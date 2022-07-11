class Dup
{
	public static void main(String arg[])
	{
			//int[] a={1,2,3,2,7,9,12,7,65,32};
			int[] a={2,3,2,2,3};
			int[] a={2,2,2,2,2};
			int l=a.length;
			for(int i=0;i<l-1;i++)
			{
				for(int j=i+1;j<l;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=a[l-1];
						l--;
					}
				}
			}
			System.out.println(l);
			for(int i=0;i<l;i++)
			{
				System.out.print(a[i]+" ");
			}
	}
}