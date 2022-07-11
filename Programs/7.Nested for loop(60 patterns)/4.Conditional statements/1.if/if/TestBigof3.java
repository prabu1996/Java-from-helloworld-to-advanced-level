import java.io.*;
class TestBigof3 {
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a,b,c;
			System.out.println("enter a value");
			a=Integer.parseInt(t.readLine());
			System.out.println("enter b value");
			b=Integer.parseInt(t.readLine());
			System.out.println("enter c value");
			c=Integer.parseInt(t.readLine());
			if((a>b) && (a>c)) 
					System.out.println("biggest number is... "+a);
			if((b>a) && (b>c))
					System.out.println("biggest number is ..."+b);
			if((c>a) && (c>b))
					System.out.println("biggest number is..."+c);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}