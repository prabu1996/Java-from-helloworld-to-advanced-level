class $SwapLogic4 {
	public static void main(String arg[]) { 
		double a,b;
		a=Double.parseDouble(arg[0]);
		b=Double.parseDouble(arg[1]);
		a=a^b;
		b=a^b;
		a=a^b;		
		System.out.println("after swaping..."+a+" "+b);
	}

}
//error