import java.util.Scanner;

class B
{
	String empname;
	int empid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		empname=sc.next();
		empid=sc.nextInt();
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Your value is::"+empname+""+empid);
	}
}
public class Demo {

	public static void main(String[] as) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
