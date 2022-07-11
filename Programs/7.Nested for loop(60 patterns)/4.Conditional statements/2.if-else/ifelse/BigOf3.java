import java.io.*;
class BigOf3 { 
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
			if ((a>b)&&(a>c))
				System.out.println("a is the biggest number");
			else if ((b>a)&&(b>c))
				System.out.println("b is the biggest number");
			else if ((a==b)&&(b==c)) 	
				System.out.println("a b c are equal");
			else 
				System.out.println("c is the biggest number");	
		}

		catch (Exception e) {
			System.out.println("c is the biggest number");
		}
	}
}