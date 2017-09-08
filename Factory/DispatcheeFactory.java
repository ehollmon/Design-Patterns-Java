
public class DispatcheeFactory {
	
	public Dispatchee makeDispatchee(String newDisptcheeType) {
		
		if(newDisptcheeType.equals("p") || newDisptcheeType.equals("P")) {
			
			return new Police();
			
		} else if(newDisptcheeType.equals("f") || newDisptcheeType.equals("F")) {
			
			return new Firefighter();
			
		} else if(newDisptcheeType.equals("m") || newDisptcheeType.equals("M")) {
			
			return new Paramedics();
			
		} else return null;
		
	}
	
}
