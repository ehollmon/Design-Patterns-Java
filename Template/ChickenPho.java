
public class ChickenPho extends Pho{
	
	String meatUsed = "Chicken";
	String veggiesUsed = "Bok Choy";
	String[] garnishmentsUsed = {"Basil", "Lime", "Bean Sprouts"};
	
	public ChickenPho() {
		System.out.println("Preparing Chicken Pho");
	}

	@Override
	void addMeat() {
		
		System.out.println("Adding meat: " + meatUsed);
		
	}

	@Override
	void addVegetables() {
		
		System.out.println("Adding Vegetables: " + veggiesUsed);

	}

	@Override
	void addGarnishments() {
		
		System.out.println("Adding Garnishments: ");
		
		for(String garnishment: garnishmentsUsed) {
			
			System.out.println(garnishment);
			
		}
		
	}

}
