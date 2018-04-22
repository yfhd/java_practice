
class Animal {
	void eat() {
		System.out.println("animal: eat");
	}
	
	public void move() {
		System.out.println("Animal can move");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog: eat");
	}
	
	void eatTest() {
		this.eat();
		super.eat();
	}
	
	public void move() {
		super.move();
		System.out.println("Dog can run and walk");
	}
	
	public void bark() {
		System.out.println("Dog can bark");
	}
}

public class Inheritance {
    public static void main(String[] args) {
    	Animal a = new Animal();
    	a.eat();
    	
    	Dog d = new Dog();
    	d.eatTest();
    	
    	a.move();
    	d.move();
    	
    	Animal b = new Dog();
    }
}
