
class Sample
{
	String pname="apple";//class or instance variable
	void fun1()
	{
		int pid=1001;//local variable
		System.out.println("Your fun1 data is::"+pid+""+pname);
	}
	void display()
	{
		System.out.println("Your display data is::"+pname);
	}
	void argufun(int cid,String cname)//passing some argument to the function
	{
		System.out.println("Your value is::"+cid+""+cname);
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.fun1();
		f1.display();
		f1.argufun(2001,"azar");

	}

}
