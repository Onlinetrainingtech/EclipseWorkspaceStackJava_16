class Demo
{
	int a1,b1;
	void get1(int pid,int cid)
	{
		this.a1=pid;
		this.b1=pid;
		  System.out.println("Your data is::"+pid+""+cid);
	}
	void get2()
	{
		System.out.println("Your data is::"+a1+""+b1);
	}
}
public class Sample {

	public static void main(String[] args) 
	{
		
		
		Demo f1=new Demo();
		f1.get1(1001,2001);
		f1.get2();
		

	}

}
