import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
	void writeData() throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("D:\\ab.txt"))
		{
			int i;
			String name="mohamed";
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\ab.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void copyData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\ab.txt");
			FileOutputStream fos=new FileOutputStream("D:\\abc.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((byte)i);
			}
			System.out.println("Data Copy...");
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void readtwoData() throws IOException
	{
		FileInputStream fis1=new FileInputStream("D:\\ab.txt");
		FileInputStream fis2=new FileInputStream("D:\\abc.txt");
		FileOutputStream fos1=new FileOutputStream("D:\\abcd.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int i;
		while((i=sis.read())!=-1)
		{
			//System.out.print((char)i);
			fos1.write((byte)i);
		}
		
		System.out.println("Inserted...");
	}
	void filewriterp1() throws IOException
	{
		try
		{
			FileWriter fw=new FileWriter("D:\\abc3.txt");
			fw.write("welcome");
			System.out.println("FileInserted..");
			fw.close();
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		//f1.writeData();
		//f1.readData();
		//f1.copyData();
		//f1.readtwoData();
		f1.filewriterp1();
	}

}
