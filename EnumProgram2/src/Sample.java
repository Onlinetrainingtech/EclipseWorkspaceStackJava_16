
public class Sample 
{
   enum gg{a1(100),b1(200);
	   private int h;
	   gg(int g)
	   {
		   h=g;
	   }
	   int get()
	   {
		   return h;
	   }
   }
	public static void main(String[] args) {
		
		gg g=gg.b1;
		System.out.println("value is::"+g.get());

	}

}
