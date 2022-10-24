import java.util.Scanner;

class Demo
{
	int pid;
	String pname;
	Scanner sc=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the pid is::");
		pid=sc.nextInt();
		System.out.println("Enter the pname is::");
		pname=sc.next();
	}
	void display()
	{
		System.out.println("Your value is::"+pid+""+pname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
