import java.io.* ;
class TestAdd3 {
	public static void main(String arg[]) {
		try {
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter a");
			int a=Integer.parseInt(t.readLine());
			System.out.println("enter b");
			int b=Integer.parseInt(t.readLine());
			int c=a+b;
			System.out.println("sum of a,b is  "+c);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}