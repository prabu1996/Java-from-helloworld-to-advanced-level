import java.io.*	;
class TestDiv {
	public static void main(String arg[]) {
		try {
		   DataInputStream t=new DataInputStream(System.in);
		   System.out.println("enter a");
		   int a,b,c ;
		   a=Integer.parseInt(t.readLine());
		   System.out.println("enter b");
		   b=Integer.parseInt(t.readLine());
		   c=a/b;
		   System.out.println("Div of a&b is  "+ c);
		}
		catch (Exception e) {
			System.out.println(e);
		}	 
	}
}