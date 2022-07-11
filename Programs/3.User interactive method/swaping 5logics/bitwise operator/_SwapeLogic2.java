class _SwapeLogic2
{
	public static void main(String arg[])
	{
		double a,b,c;
		a=Double.parseDouble(arg[0]);
		b=Double.parseDouble(arg[1]);
		a=a+b;
		b=a-b;
		a=a-b;
		//System.out.println("a="+a);
		//System.out.println("b="+b);
		System.out.println("after swapping values are.."+a+","+b);
	}
}
