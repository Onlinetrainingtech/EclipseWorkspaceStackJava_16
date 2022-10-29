import java.util.Scanner;

class Demo
{
	int pid[][]=new int[2][2];
	int i,j,m,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("Enter the array value is::");
				pid[i][j]=sc.nextInt();
			}
		}
	}
	void display()
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("Your array value is::"+pid[i][j]);
			}
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
