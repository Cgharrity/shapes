/**
 * 
 */
package org.cvtc.shapes;

/**
 * @author cgharrity
 *
 */
public class ShapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creates a new Cuboid with a width of 1, height of 2, depth of 3
		Cuboid cuboid = new Cuboid(1, 2, 3);
		
		// Creates a new cylinder with a radius of 12, and height of 24
		Cylinder cylinder = new Cylinder(12, 24);
		
		// Creates a new sphere with a radius of 24
		Sphere sphere = new Sphere (24);
		
		// Runs render for the cuboid to output depth, height, width, SA, and volume
		cuboid.render();
		
		// Runs render for the cylinder to output radius, height, SA, and volume
		cylinder.render();
		
		
		// Runs render for the sphere to output radius, SA, and volume
		sphere.render();
			
	}

}
