

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
    }
	
	public static void sayWords(String s) {
		System.out.println(s);
	}
}
