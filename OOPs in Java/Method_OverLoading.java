package Opps;

public class Method_OverLoading {
       void show(){
    	   System.out.println(" First");
       }
       void show(int a) {
    	   System.out.println("Second");
       }
       void add(int a  , int b) {
    	   System.out.println(a+b);
       }
       void add(int a  , int b ,int c) {
    	   System.out.println(a+b+c);
       }
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Method_OverLoading t1 = new Method_OverLoading();
        t1.show();
        t1.show(5);
        t1.add(5, 5);
        t1.add(1, 2 ,3);
	}

}
