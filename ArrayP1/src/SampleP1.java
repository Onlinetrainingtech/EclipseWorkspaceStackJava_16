import java.util.Scanner;

class Demo
{
	int pid[]=new int[5];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		n=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			pid[i]=sc.nextInt();
		}
	}
	void display()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Your array value is::"+pid[i]);
		}
	}
}
public class SampleP1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();
		f1.display();
	}

}
