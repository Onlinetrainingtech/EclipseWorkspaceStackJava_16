class Demo<M>
{
	public M t;//public int t;
	public void setValue(M t)  //public void setValue(int t)
	{
		this.t=t;
	}
	public void get()
	{
		System.out.println("This is get value is::"+t);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo<Integer>h1=new Demo<Integer>();
		Demo<String>h2=new Demo<String>();
		h1.setValue(1001);
		h1.get();
		h2.setValue("azar");
		h2.get();

	}

}
