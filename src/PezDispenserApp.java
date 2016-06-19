
public class PezDispenserApp {
	
	public static void main (String[] args) {
		System.out.println("we are making a pez dispenser app.");
		
		
		PezDispenser dispenser = new PezDispenser("Yoda");
		System.out.println("The dispenser character is " + dispenser.getCharacterName());
		
	}
	
}