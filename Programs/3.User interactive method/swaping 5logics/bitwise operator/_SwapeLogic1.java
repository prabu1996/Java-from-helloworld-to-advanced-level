class _SwapeLogic1
{
	public static void main(String arg[])
	{
		double a,b,c;
		a=Double.parseDouble(arg[0]);
		b=Double.parseDouble(arg[1]);
		c=a;
		a=b;
		b=c;
		//System.out.println("a="+a);
		//System.out.println("b="+b);
		//System.out.println("c="+c);
		System.out.println("after swapping values are.."+a+","+b);
	}
}
