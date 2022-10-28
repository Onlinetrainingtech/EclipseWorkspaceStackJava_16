
public class SampleP4 {

	public static void main(String[] args) {
		
		int t=345,remainder,sum=0;
		while (t != 0)
		   {
		      remainder = t % 10;
		      sum       = sum + remainder;
		      t         = t / 10;
		   }
		System.out.println("Your value is::"+sum);

	}

}
