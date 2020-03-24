package joshuakaplan.bedroom;

public class BedroomObject {
	private String type;
	private String[] adjectives;
	private Dimensions dimensions;
	
	public BedroomObject(String type, Dimensions dimensions, String ...adjectives) {
		this.type = type;
		this.dimensions = dimensions;
		this.adjectives = adjectives;
	}

	public String getType() {
		return type;
	}

	public String[] getAdjectives() {
		return adjectives;
	}
	
	public Dimensions getDimensions() {
		return dimensions;
	}
	
	@Override
	public String toString() {
		String toString = "The " + type + " " + getClassLowerCase() + " is ";
		
		switch (adjectives.length) {
			case 1:
				toString += adjectives[0];
				break;
			case 2:
				toString += adjectives[0] + " and " + adjectives[1];
				break;
			case 3:
				for (int i = 0; i < adjectives.length - 1; i++) {
					toString += adjectives[i] + ", ";
				}
				toString += "and " + adjectives[adjectives.length - 1];
				break;
		}
		toString += ".";
		
		return toString;
	}
	
	private String getClassLowerCase() {
		String classString = this.getClass().toString();
		String[] classArray = classString.split("\\.");
		return classArray[classArray.length - 1].toLowerCase();
	}
}
