class Demo
{
	void arithmeticOperators()
	{
		int a1=100,b1=200;
		System.out.println("Add::"+(a1+b1));
		System.out.println("Sub::"+(a1-b1));
		System.out.println("Mul::"+(a1*b1));
		System.out.println("Div::"+(a1/b1));
	}
	void relationalOperators()
	{
		int a2=100,b2=300;
		System.out.println("Lessthan::"+(a2<b2));
		System.out.println("Greaterthan::"+(a2>b2));
		System.out.println("Equal is::"+(a2==b2));
		System.out.println("NotEqual is::"+(a2!=b2));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.arithmeticOperators();
		f1.relationalOperators();

	}

}
