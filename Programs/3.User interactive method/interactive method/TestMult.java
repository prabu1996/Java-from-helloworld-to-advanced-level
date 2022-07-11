import java;
class TestMult {
	public static void main(String arg[]) {
		try {
		   DataInputStream t=new DataInputStream(System.in);
		   System.out.println("enetr a");
		   int a,b,c ;
		   a=Integer.parseInt(t.readLine());
		   b=Integer.parseInt(t.readline());
		   c=a*b;
		   System.out.println("Mult of a&b is  "+ c);
		}
		catch (Exception e) {
			System.out.println(e);
		}	 
	}
}