class Demo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("ThreadIn");
			
			Thread.sleep(10000);
			System.out.println("ThreadOut");
			System.out.println("Your Current ThreadName is::"+currentThread().getName());
			System.out.println("Your Priority is:::"+currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		
		t1.start();
		t2.start();
		t1.setName("FinalThread-0");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.isInterrupted());
		System.out.println(t1.isAlive());

	}

}
