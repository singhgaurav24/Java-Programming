package Opps;

public class Animal {
	String color;
	int age;
public static void eat() {
	System.out.println("Hello everyone");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal x1 = new Animal();
//		Bird b = new Bird();
//		System.out.println("This is Gaurav Singh");
//        x1.eat();
//        eat();
//        b.fly();
        x1.color = "Red";
        x1.age = 110;
        System.out.println(x1.color +"  "+x1.age);
	}

}

class Bird{
	public static void fly() {
		System.out.println("Birds flys in Air");
	}
}