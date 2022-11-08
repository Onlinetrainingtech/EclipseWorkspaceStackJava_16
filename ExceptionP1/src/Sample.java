
public class Sample 
{

	void get1()
	{
		try
		{
		int a=100,c;
		c=a/0;
		System.out.println("Your data is::"+c);
		}
		catch(ArithmeticException r)
		{
			System.out.println(r);
		}
		get2();
	}
	void get2()
	{
		try
		{
		String name=null;
		System.out.println("This is get2 functions::"+name.length());
		}
		catch(NullPointerException t)
		{
			System.out.println(t);
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
	
	public static void main(String[] args) {
	
		Sample s1=new Sample();
		s1.get1();

	}

}
