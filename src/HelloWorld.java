
class Puppy {
	int puppyAge;
	
	public Puppy(String name) {
		System.out.println("Name of the dog is: " + name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		System.out.println("Age of the dog is: " + puppyAge);
		
		return puppyAge;
	}
}

class FreshJuice {
	enum FreshJuiceSize { SMAL, MEDIUM, LARGE }
	
	FreshJuiceSize size; 
}

public class HelloWorld {
	public static void main(String[] args) {
        System.out.println("Hello World");
        
        sayWords("Hallo Kokoti");
        
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        
        Puppy myPuppy = new Puppy("tommy");
        
        myPuppy.setAge(3);
        myPuppy.getAge();
        System.out.println("Value of varialbe: " + myPuppy.puppyAge);
    }
	
	public static void sayWords(String s) {
		System.out.println(s);
	}
}
