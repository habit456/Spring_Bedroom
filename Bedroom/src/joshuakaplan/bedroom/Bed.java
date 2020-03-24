package joshuakaplan.bedroom;

public class Bed extends BedroomObject {
	private Sheets sheets;
	private Mattress mattress;
	
	public Bed(String type, Dimensions dimensions, Sheets sheets, Mattress mattress, String... adjectives) {
		super(type, dimensions, adjectives);
		this.sheets = sheets;
		this.mattress = mattress;
	}

	public Sheets getSheets() {
		return sheets;
	}

	public Mattress getMattress() {
		return mattress;
	}
}
