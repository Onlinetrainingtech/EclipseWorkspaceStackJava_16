
abstract class Demo
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is normal method..");
	}
}
class Foo extends Demo
{
	public void get1()
	{
		System.out.println("This is abstract method...");
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1();
		f1.get2();

	}

}
