//import java.util.Calendar;
class Test16
{
	public static void main(String arg[])
	{
		String a="prabu";
		//int n=a.length();
		//byte[] b=new byte[n];
		//b=a.getBytes();
		//for(int i=0;i<n;i++)
		//{
			//System.out.println("b["+i+"]="+b[i]);
		//}
		//String c=new String(b);
		//System.out.println(b);
	
		byte[] b=a.getBytes();
		String c=new String(b);
		System.out.println(c);
	}
}