package Opps;
class Test{
	void show() {
		System.out.println("1");
	}
}
public class Method_Overriding extends Test{
//	void show() {
//		System.out.println("2");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test t1 = new Test();
     t1.show();
     Method_Overriding t2 = new Method_Overriding();
     t2.show();
	}

}
