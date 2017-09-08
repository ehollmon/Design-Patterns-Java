
public class SingletonTest {
	
	public static void main(String[] args) {
		
		//Create two instances and check that they are the same object
		
		Singleton instance1 = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(instance1));
		
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(instance2));
		
	}
}
