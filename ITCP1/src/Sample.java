class Demo
{
	public synchronized void get1()
	{
		try
		{
			System.out.println("Welcome to wait");
			wait(1000);
			System.out.println("WaitOut");
		}
		catch(InterruptedException r)
		{
			
		}
	}
	public synchronized void get2()
	{
		notify();
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1();
		t1.get2();

	}

}
