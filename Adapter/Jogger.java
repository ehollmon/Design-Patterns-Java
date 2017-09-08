
public class Jogger implements Pedestrian {

	@Override
	public void walk() {
		System.out.println("Person Walks 1 step forward");
	}

	@Override
	public void jump() {
		System.out.println("Person bends knees and jumps");		
	}

}
