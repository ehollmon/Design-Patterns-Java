
abstract class IngredientDecorator implements Burrito {
	
	protected Burrito tempBurrito;
	
	public IngredientDecorator(Burrito newBurrito) {
		
		tempBurrito = newBurrito;
		
	}
	
	public String getDescription() {
		
		return tempBurrito.getDescription();
		
	}
	
	public double getCost() {
		
		return tempBurrito.getCost();
		
	}

}
