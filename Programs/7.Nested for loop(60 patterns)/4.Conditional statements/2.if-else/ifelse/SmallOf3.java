import java.io.*;
class SmallOf3 { 
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int a,b,c;
			System.out.println("enter a");
			a=Integer.parseInt(t.readLine());
			System.out.println("enter b");
			b=Integer.parseInt(t.readLine());
			System.out.println("enetr c");
			c=Integer.parseInt(t.readLine());
			if ((a<b)&&(a<c))
				System.out.println("a is the smallest number");
			else if ((b<a)&&(b<c))
				System.out.println("b is the smallest number");
			else if ((a==b)&&(b==c)) 	
				System.out.println("a b c are equal");
			else 
				System.out.println("c is the smallest number");	
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}