abstract class MyAnimal {
	abstract void eat();
}

class MyCat extends MyAnimal {
	public void eat() {
		System.out.println("Eat fish");
	}
	
	public void work() {
		System.out.println("hunt mouse");
	}
}

class MyDog extends MyAnimal {
	public void eat() {
		System.out.println("Eat bone");
	}
	
	public void work() {
		System.out.println("Guard home");
	}
}

public class Test_Polymorphism {
    public static void main(String[] args) {
    	show(new MyCat());
    	show(new MyDog());
    	
    	MyAnimal a = new MyCat();
    	a.eat();
    	
    	MyCat c = (MyCat) a;
    	c.work();
    }
    
    public static void show(MyAnimal a) {
    	a.eat();
    	
    	if(a instanceof MyCat) {
    		MyCat c = (MyCat) a;
    		c.work();
    	}
    	else if (a instanceof MyDog) {
    		MyDog d = (MyDog) a;
    		d.work();
    	}
    }
}
