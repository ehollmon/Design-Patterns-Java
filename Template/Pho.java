
public abstract class Pho {
	
	final void makeSoup() {
		
		addNoodles();
		addBroth();
		
		if(customerWantsMeat()) {
			
			addMeat();
			
		}
		
		if(customerWantsVegetables()) {
			
			addVegetables();
			
		}
		
		if(customerWantsGarnishments()) {
			
			addGarnishments();
			
		}
		
	}
	
	public void addNoodles() {
		
		System.out.println("Adding Noodles");
		
	}
	
	public void addBroth() {
		
		System.out.println("Pouring Broth");
		
	}
	
	abstract void addMeat();
	abstract void addVegetables();
	abstract void addGarnishments();
	
	boolean customerWantsMeat() {return true;}
	boolean customerWantsVegetables() {return true;}
	boolean customerWantsGarnishments() {return true;}
	
}
