
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=100,b = 15, c= 18;
       
      int largest = ((a>b) ? (a>c) ? a : c : (b>c) ? b: c);
      
      System.out.println("largest of three is: "+" " +largest);
       
	}

}
