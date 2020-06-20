import java.util.Scanner;
public class Scanner1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc  = new Scanner(System.in);
	     
	     System.out.println("Enter Name");
         String name = sc.nextLine();
        
         System.out.println("Roll no.");
         int roll = sc.nextInt();
         
         System.out.println(name);
         System.out.println(roll);
	}

}
