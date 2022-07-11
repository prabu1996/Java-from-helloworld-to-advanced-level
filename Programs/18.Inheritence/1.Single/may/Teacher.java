class HeadTeacher
{
	String desig="Teacher";
	String clg="GCT";
	public void function()
	{
		System.out.println("Going to college");
	}
}
class Teacher extends HeadTeacher
{
	String sub="Spark";
	public static void main(String arg[])
	{
		Teacher t1=new Teacher();
		System.out.println(t1.clg);
		System.out.println(t1.desig);
		t1.function();		
	}
}