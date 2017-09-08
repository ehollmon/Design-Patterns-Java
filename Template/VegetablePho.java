
public class VegetablePho extends Pho {
	
	String[] veggiesUsed = {"Bok Choy", "Mushrooms", "Broccoli", "Onions", "Carrots"};
	String[] garnishmentsUsed = {"Basil", "Lime", "Bean Sprouts"};
	
	boolean customerWantsMeat() {return false;}
	
	public VegetablePho() {
		
		System.out.println("Preparing Vegetable Pho");
		
	}

	@Override
	void addMeat() {}

	@Override
	void addVegetables() {
		
		System.out.println("Adding Vegetables: ");
		
		for(String veggie: veggiesUsed) {
			
			System.out.println(veggie + " ");
			
		}

	}

	@Override
	void addGarnishments() {
		
		System.out.println("Adding Garnishments: ");
		
		for(String garnishment: garnishmentsUsed) {
			
			System.out.println(garnishment + " ");
			
		}
		
	}

}
