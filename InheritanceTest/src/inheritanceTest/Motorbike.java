package inheritanceTest;

public class Motorbike extends Bike {
	private String bikeColor;
	private boolean isElectric;
	
	public Motorbike (int numWheels, String bikeColor, boolean isElectric) {
		super(numWheels, bikeColor);
		this.bikeColor= bikeColor;
		this.isElectric= isElectric;
	}
	
	public String getBikeColor() {
		return bikeColor;
	}
	
	public boolean isElectric() {
		return isElectric;
	}

	public boolean getIsElectric() {
		// TODO Auto-generated method stub
		return false;
	}
}
