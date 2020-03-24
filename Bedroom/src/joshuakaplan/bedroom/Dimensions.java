package joshuakaplan.bedroom;

public class Dimensions {
	int x;
	int y;
	int z;
	
	public Dimensions(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void printDimensions() {
		System.out.printf("%d by %d by %d%n", this.x, this.y, this.z);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}
}
