
public class Singleton {
	
	//Holds the one and only instance for the Singleton class and make it globally available
	private static Singleton firstInstance = null;
	
	//Make it private to ensure there is only one class
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(firstInstance == null) {
			
			//lazy instantiation 
			firstInstance = new Singleton();
			
		}
		
		return firstInstance;
	}

}
