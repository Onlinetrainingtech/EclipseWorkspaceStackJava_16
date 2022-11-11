class Demo extends Thread
{
	public void run()
	{
		System.out.println("This is Thread Class"+currentThread().getName());
		get1();
	}
	void get1()
	{
		System.out.println("Normal method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		Demo f2=new Demo();
		f1.setName("Welcome");
		f1.start();
		f2.start();;

	}

}
