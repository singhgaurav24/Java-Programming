
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static_Initializing {

//Write your code here
	
//	static Scanner sc = new Scanner(System.in);
//	static int B = sc.nextInt();
//	static int H = sc.nextInt();
	static boolean flag = true;
	static int H,B;
	static
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Bradth of the pallogram");
		B = sc.nextInt();
		System.out.println("Height of the pallogram");
		H = sc.nextInt();
		if(B>=0 && H>=0)
		{
			flag = true;
		}
		else //if(B<=0 && H>=0 || B>=0 && H<=0)
		{
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
			
		
	}
	
//	public static int B;
//   public static int H; 

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print("Area of pallogram is :"+"  ");
			System.out.print(area);
		}
		
	}
}