import java.util.Scanner;
public class HasNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc  = new Scanner(System.in); 
         System.out.println("Enter 5 Number");
         int sum=0,count =0;
         int num=5;
         
         for(int i=0;i<num;i++)
         {
        	 
        	 sc.nextInt();
        	 sum += num;
        	 count++;
         }
         
       /*  
         while(sc.hasNextInt())
         {
        	 int num = sc.nextInt();
        	 sum += num;
        	 count++;
        	 
         }
           sc.close();
         */
         
        int mean = sum / count;
         System.out.println("Sum: " + sum);
         System.out.println("Mean: " + mean);
	}

}
