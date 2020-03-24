package joshuakaplan.bedroom;

public class Bedroom {
	private Bed bed;
	private Dimensions dimensions;
	private Floor floor;
	private Walls walls;
	private Lamp lamp;
	
	public Bedroom(Bed bed, Dimensions dimensions, Floor floor, Walls walls, Lamp lamp) {
		this.bed = bed;
		this.dimensions = dimensions;
		this.floor = floor;
		this.walls = walls;
		this.lamp = lamp;
	}

	public Bed getBed() {
		return bed;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public Floor getFloor() {
		return floor;
	}

	public Walls getWalls() {
		return walls;
	}

	public Lamp getLamp() {
		return lamp;
	}
}
