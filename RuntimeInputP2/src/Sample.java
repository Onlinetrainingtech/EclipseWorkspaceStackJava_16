import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int cid;
	String cname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws NumberFormatException, IOException
	{
		System.out.println("Enter the value is::");
		cid=Integer.parseInt(dis.readLine());
		cname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your value is::"+cid+""+cname);
	}
}
public class Sample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Demo f1=new Demo();
		f1.input();
		f1.display();

	}

}
