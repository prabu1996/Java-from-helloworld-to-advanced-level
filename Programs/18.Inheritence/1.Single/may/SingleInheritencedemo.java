import java.util.*;
class demoYuvasakthi{
	protected int a,b;
	public demoYuvasakthi(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void display() {
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}
class B extends demoYuvasakthi{
	protected int c;
	public B(int a,int b) {
		super(a,b);
	}
	public void operation() {
		c=a+b;
		System.out.println("Sum of a and b="+c);
	}
}
class SingleInheritencedemo{
	public static void main(String arg[]) {
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter x and y");
		int x=t1.nextInt();
		int y=t1.nextInt();
		B t2=new B(x,y);
		t2.display();
		t2.operation();	
	}
}