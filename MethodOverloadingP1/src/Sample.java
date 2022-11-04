class Demo
{
	void get1(int pid,String pname)
	{
		System.out.println("Your data is::"+pid+""+pname);
	}
	void get1(int empid)
	{
		System.out.println("Your data is::"+empid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,"apple");
		f1.get1(2001);

	}

}
