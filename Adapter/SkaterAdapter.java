
public class SkaterAdapter implements Pedestrian {
	
	Skater tHawk = new Skater();

	@Override
	public void walk() {
		tHawk.kickPush();
	}

	@Override
	public void jump() {
		tHawk.ollie();
	}

}
