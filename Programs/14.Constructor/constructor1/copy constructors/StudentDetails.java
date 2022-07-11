import java.util.Scanner;
class SubClass
{
	int a,b,c,d,e,total,avg;
	String name;
	public SubClass(int a,int b,int c,int d,int e,String name)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.name=name;
	}
	public SubClass(SubClass t4)
	{
		this.a=t4.a;
		this.b=t4.b;
		this.c=t4.c;
		this.d=t4.d;
		this.e=t4.e;
		this.name=t4.name;
	}
	public void function()
	{
		int total=(a+b+c+d+e);
		int avg=(a+b+c+d+e)/5;
		this.total=total;
		this.avg=avg;
		
	}
	public void display()
	{
		System.out.println("Student name="+name);
		System.out.println("total marks="+total);
		System.out.println("av erage marks="+avg);
	}
}
class StudentDetails
{
	public static void main(String arg[])
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("Enter nameof the student follwed by subject marks in order");
		String name=t1.next();
		int a=t1.nextInt();
		int b=t1.nextInt();
		int c=t1.nextInt();
		int d=t1.nextInt();
		int e=t1.nextInt();
		SubClass t2=new SubClass(a,b,c,d,e,name);
		SubClass t3=new SubClass(t2);
		t2.function();
		t2.display();
	}
}