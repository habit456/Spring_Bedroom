package joshuakaplan.bedroom;

public class Lamp extends BedroomObject {
	boolean isLampOn = false;

	public Lamp(String type, Dimensions dimensions, String... adjectives) {
		super(type, dimensions, adjectives);
		// TODO Auto-generated constructor stub
	}

	public boolean isLampOn() {
		return isLampOn;
	}
	
	public String use() {
		if (isLampOn) {
			isLampOn = false;
			return "Lamp is turned off.";
		} else {
			isLampOn = true;
			return "Lamp is turned on";
		}
	}
}
