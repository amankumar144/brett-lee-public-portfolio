package lazyperegrin.model;

public class Location {
	public final int x;
	public final int y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distanceFromLocation(Location loc) {
		return (loc != null) ? 
				Math.sqrt((this.x - loc.x) ^ 2 + (this.y - loc.y) ^ 2) 
				: 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Location [x=" + x + ", y=" + y + "]";
	}

}