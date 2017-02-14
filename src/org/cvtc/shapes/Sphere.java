/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author cgharrity
 *
 */
public class Sphere extends Shape {
	
	// Defines the radius of a Sphere
	private float radius = 0.0f;

	// Gets the radius of a Sphere
	public float getRadius() {
		return radius;
	}

	// Sets the radius of a Sphere
	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Creates new Sphere object 
	public Sphere(float radius){
		// Sets the dimensions of the Sphere
		setRadius(radius);
	}

	// Equation to get the surface area of a Sphere
	@Override
	public float getSurfaceArea() {
		// 4*PI*r2
		return (float) (4*Math.PI*(getRadius()*getRadius()));
	}

	// Equation to get the volume of a Sphere
	@Override
	public float getVolume() {
		// V=4/3*PI*r3
		return (float) ((4.0f/3.0f)*Math.PI*(getRadius()*getRadius()*getRadius()));
	}

	// Display the radius, surface area, and volume of a Sphere.
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "The radius of the sphere is: " + getRadius() + 
				", the surface area of the sphere is: " + getSurfaceArea() + 
				", the volume of the sphere is: " + getVolume());
	}
	

}
