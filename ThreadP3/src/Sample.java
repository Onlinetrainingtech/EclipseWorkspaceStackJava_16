class Demo extends Thread
{
	public void run()
	{
		int i;
		try
		{
			for(i=0;i<=5;i++)
			{
			System.out.println("I value is:::"+i);
			Thread.sleep(10000);
			}
			System.out.println("I value is:::"+i);
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
		try
		{
			System.out.println("JoinIn");
			t1.join(10000);
			System.out.println("JoinOut");
		}
		catch(InterruptedException t)
		{
			
		}
         t2.start();
	}

}
