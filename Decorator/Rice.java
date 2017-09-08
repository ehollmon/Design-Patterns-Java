
public class Rice extends IngredientDecorator {

	public Rice(Burrito newBurrito) {
		super(newBurrito);
		
		System.out.println("Adding Tortilla");
		
		System.out.println("Adding Rice");
		
	}
	
	public String getDescription() {
		
		return tempBurrito.getDescription() + ", Rice";
		
	}
	
	public double getCost() {
		
		return tempBurrito.getCost() + .10;
		
	}

}
