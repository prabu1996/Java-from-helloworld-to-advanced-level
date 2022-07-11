class $SwapLogic3 {
	public static void main(String arg[]) { 
		double a,b,c;
		a=Double.parseDouble(arg[0]);
		b=Double.parseDouble(arg[1]);
		c=Double.parseDouble(arg[2]);
		a=(a*b*c)/(a*c);
		b=(a*b*c)/(c*a);
		c=(a*b*c)/(a*b);		
		System.out.println("after swaping..."+a+" "+b+" "+c);
	}

}