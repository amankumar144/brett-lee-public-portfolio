package lazyperegrin.logic;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import lazyperegrin.model.Location;

/**
 * From: http://anathem.wikia.com/wiki/Lazy_Peregrin_problem
 * 
 * The problem concerns a wandering fraa who needs to visit several maths that
 * are scattered randomly around the world. The fraa does not wish to work
 * harder than he has to and so must find the shortest possible route that will
 * take him to each of his destinations.
 * 
 *
 * @author leebrett https://github.com/leebrett/brett-lee-public-portfolio
 */
public class Peregrination {
	private Map<Double, Set<Location>> locationsByDistanceFromOrigin;;
	private Location origin;
	private Location lastStop;

	public Peregrination(Location origin, Location[] locations) {
		if (origin != null && locations != null) {
			this.origin = origin;
			this.locationsByDistanceFromOrigin = new TreeMap<>();
			for (Location loc : locations) {
				double distanceFromOrigin = loc.distanceFromLocation(origin);
				
			}
		} else {
			throw new IllegalArgumentException(String.format(
					"Arguments cannot be null: origin = %s, locations = %s",
					origin, locations));
		}

	}

}
