import java.util.Scanner;

public class FactoryTest {
	public static void main(String[] args) {
		
		DispatcheeFactory dispatcheeFactory = new DispatcheeFactory();
		
		Dispatchee dispatchee = null;
		
		System.out.println("Who do you need? P - Police, F - Firefighter, M - Paramedics ");
		
		Scanner userInput = new Scanner(System.in);
						
		if(userInput.hasNextLine()) {
			
			String typeOfDispatchee = userInput.nextLine();
			
			dispatchee = dispatcheeFactory.makeDispatchee(typeOfDispatchee);
			
		}
		
		if(dispatchee != null) {
			
			dispatchee.driveToEmergency();
			
		}
		
	}
}
