
public class Beans extends IngredientDecorator {

	public Beans(Burrito newBurrito) {
		super(newBurrito);
		
		System.out.println("Adding Beans");
				
	}
	
	public String getDescription() {
		
		return tempBurrito.getDescription() + ", Beans";
		
	}
	
	public double getCost() {
		
		return tempBurrito.getCost() + .40;
		
	}
}
