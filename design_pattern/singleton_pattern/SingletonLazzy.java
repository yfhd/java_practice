package singleton_pattern;

public class SingletonLazzy {
    private static SingletonLazzy instance;
    
    private SingletonLazzy() {}
    
    public static synchronized SingletonLazzy getInstance() {
    	if(instance == null) {
    		instance = new SingletonLazzy();
    	}
    	
    	return instance;
    }
}
