interface B
{
	int pid=1001;
	void get1();
}
class D implements B
{
	public void get1()
	{
		System.out.println("Your value is::"+pid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();

	}

}
