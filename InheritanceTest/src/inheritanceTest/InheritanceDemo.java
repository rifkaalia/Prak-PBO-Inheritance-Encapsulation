package inheritanceTest;

public class InheritanceDemo {
	public static void main (String[] args) {
		Convertible Toyota= new Convertible(4, 4, false, "Roof Railed");
		System.out.println("Number of Doors on Toyota's Car: "+Toyota.getNumDoors());
		System.out.println("Number of Wheels on Toyota's Car: "+Toyota.getWheels());
		String electric;
		electric= Toyota.getIsElectric()? "yes" : "no";
		System.out.println("Is the Toyota's Car electric? "+electric);
		System.out.println("The Roof Type of Toyota's Car: "+Toyota.getRoofType());
		
		System.out.println();
		Motorbike Yamaha= new Motorbike(2, "White", false);
		System.out.println("Number of Wheels on Yamaha's Motorbike: "+Yamaha.getWheels());
		System.out.println("The Color of Yamaha's Motorbike: "+Yamaha.getBikeColor());
		String electric2;
		electric2= Yamaha.getIsElectric()? "yes" : "no";
		System.out.println("Is the Yamaha's Motorbike electric? "+electric);
	}
}
