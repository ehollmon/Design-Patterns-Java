
public class TestPedestrians {

	public static void main(String[] args) {
		//Create the objects
		Jogger forest = new Jogger();
		
		Skater bucky = new Skater();
		
		Pedestrian skaterAdapter = new SkaterAdapter();
		
		//Jogger Test
		System.out.println("The Jogger");
		forest.walk();
		forest.jump();
		
		//Skater Test
		System.out.println("The Skater");
		bucky.kickPush();
		bucky.ollie();
		
		//Adapter Test
		System.out.println("The Adapter");
		skaterAdapter.walk();
		skaterAdapter.jump();
	}

}
