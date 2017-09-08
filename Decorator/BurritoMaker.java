
public class BurritoMaker {

	public static void main(String[] args) {
		
		Burrito basicBurrito = new Beans(new Rice(new BasicBurrito()));
		
		System.out.println("Ingredients: " + basicBurrito.getDescription());
		
		System.out.println("Price: " + basicBurrito.getCost());
		
	}

}
