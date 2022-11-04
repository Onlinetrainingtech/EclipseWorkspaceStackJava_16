class Demo
{
	
	Demo()
	{
		System.out.println("This is default conss....");
	}
	Demo(int cid)
	{
		System.out.println("This is param cons.."+cid);
	}
	
	void get1()
	{
		System.out.println("Normal method..");
	}
}
public class Sample 
{

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		new Demo(1001);
		f1.get1();

	}

}
