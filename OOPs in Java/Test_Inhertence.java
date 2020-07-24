package Opps;

public class Test_Inhertence {
	
public static class Animal{
	public void eat() {
		System.out.println("I am eating");
	}
}
public static class Dog extends Animal{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Dog d = new Dog();
        a.eat();
        d.eat();
	}

}
