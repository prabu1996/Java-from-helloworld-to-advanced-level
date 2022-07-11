class $SwapLogicThree {
	public static void main(String arg[]) { 
		double a,b;
		a=Double.parseDouble(arg[0]);
		b=Double.parseDouble(arg[1]);
		a=Math.pow(a,2)*b/Math.pow(a,2);
		b=Math.pow(b,2)*a/Math.pow(b,2);		
		System.out.println("after swaping..."+a+" "+b);
	}

}

// wrong program