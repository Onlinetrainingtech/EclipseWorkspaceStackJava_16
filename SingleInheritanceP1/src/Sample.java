class B
{
	int pid=1001;
	String pname="apple";
	
	void get1()
	{
		System.out.println("Your pid is::"+pid);
	}
}
class D extends B
{
	void display()
	{
		System.out.println("Your pname is::"+pname);
	}
}
class D1 extends D
{
	
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.display();

	}

}
