
public class Sample {

	public static void main(String[] args) {
		
		String s1=new String("Hello");
		System.out.println("Your value is::"+s1);
		String s2="Hello";
		System.out.println("Your value is::"+s2);
		System.out.println("length::"+s1.length());
        System.out.println("UpperCase::"+s1.toUpperCase());
        System.out.println("lowercase::"+s1.toLowerCase());
        System.out.println("Compare s1 and s2::"+s1.compareTo(s2));
	}

}
