import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Sample 
{
	//HashSet<Integer>list1=new HashSet<Integer>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
   void get1()
   {
	   
	   list1.add(1001);
	   list1.add(1002);
	   list1.add(1003);
	   list1.add(1004);
	   list1.add(1004);
	   System.out.println("Your data is::"+list1);
	   System.out.println("Your data is::"+list1.size());
	   
	   System.out.println("Removing data is::"+list1.remove(1));
	   System.out.println("Searching data is::"+list1.contains(1001));
	   System.out.println("After Removing data is::"+list1.size());
	   Iterator h1=list1.iterator();
	   while(h1.hasNext())
	   {
		   System.out.println("Inside While data is::"+h1.next());
	   }
	   
   }
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();

	}

}
