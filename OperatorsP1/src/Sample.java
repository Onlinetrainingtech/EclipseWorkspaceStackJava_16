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
	void logicalOperators()
	{
		int a3=100,b3=200;
		System.out.println("LogicalAND::"+((a3<b3)&&(b3>a3)));
		System.out.println("LogicalOR::"+((a3>b3)||(b3>a3)));
		System.out.println("LogicalNOT::"+!(a3<b3));
	}
	void bitwiseOperators()
	{
		int a4=2,b4=3;
		System.out.println("BitWiseAND::"+(a4&b4));
		System.out.println("BitWiseOR::"+(a4|b4));
		System.out.println("XOR::"+(a4^b4));
		System.out.println("LeftShift::"+(a4<<1));
		System.out.println("RightShift::"+(a4>>1));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.arithmeticOperators();
		//f1.relationalOperators();
		//f1.logicalOperators();
		f1.bitwiseOperators();

	}

}
