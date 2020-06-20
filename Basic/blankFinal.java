import java.util.*;
public class blankFinal {
	
	final int i;  //if we initialize here then all the object have same value.
	
	blankFinal(int x)
	{
		i=x;   //
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blankFinal obj1 = new blankFinal(10);
		System.out.println(obj1.i);
	}

}
