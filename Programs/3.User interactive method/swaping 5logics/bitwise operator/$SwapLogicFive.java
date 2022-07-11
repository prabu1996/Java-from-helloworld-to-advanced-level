class $SwapLogicFive {
	public static void main(String arg[]) { 
		double a,b;
		a=Double.parseDouble(arg[0]);
		b=Double.parseDouble(arg[1]);
		b=a+b-(a=b); //right to left		
		System.out.println("after swaping..."+a+" "+b);
	}

}
