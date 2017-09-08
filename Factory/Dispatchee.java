
public abstract class Dispatchee {
	private String name;
	
	public String getName() { return name;	}
	public void setName(String newName) {name = newName;}
	
	public void driveToEmergency() {
		
		System.out.println(getName() + " are on their way" );
		
	}

}
