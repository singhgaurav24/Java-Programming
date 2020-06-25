import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x = "Gaurav";
        String y = "singh";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m");
        String m = sc.next();
        
        System.out.println("enter n");
        String n = sc.next();
        
        if(m.equals(x) && n.equals(y))
        {
        	System.out.println("Hii");
        }
        else
        { 
        	System.out.println("does not match");
        }
	}

}
