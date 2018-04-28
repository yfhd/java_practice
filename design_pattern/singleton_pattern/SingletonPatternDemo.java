package singleton_pattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
    	SingletonObject object = SingletonObject.getInstance();
    	
    	object.showMessage();
    	
    	SingletonLazzy sl = SingletonLazzy.getInstance();
    	
    	SingletonDoubleCheckedLocking sdcl = SingletonDoubleCheckedLocking.getSingleton();
    }
}
