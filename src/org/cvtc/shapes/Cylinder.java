/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author cgharrity
 *
 */
public class Cylinder extends Shape {
	
	// Defines the radius of the Cylinder
	private float radius = 0.0f;
	
	// Defines the height of the Cylinder
	private float height = 0.0f;
	
	// Gets the radius of the Cylinder
	public float getRadius() {
		return radius;
	}
	
	// Sets the radius of the Cylinder
	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Gets the height of the Cylinder
	public float getHeight() {
		return height;
	}
	
	// Sets the hegiht of the Cylinder
	private void setHeight(float height) {
		this.height = height;
	}
	
	// Creates a new Cylinder object
	public Cylinder(float radius, float height){
		
		// Sets the dimensions of the Cylinder
		setRadius(radius);
		setHeight(height);
	}
	
	// Equation to get the surface area of a Cylinder
	@Override
	public float getSurfaceArea() {
		// 2*PI*rh+2*PI*r2
		return (float) (2*Math.PI*getRadius()*getHeight() + 2*Math.PI*(getRadius()*getRadius()));
	}
	
	// Equation to get the volume of a Cylinder
	@Override
	public float getVolume() {
		// V=PI*r2h
		return (float) (Math.PI*(getRadius()*getRadius()*getHeight()));
	}
	
	// Display radius, height, surface area, and volume in a message box.
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "The radius of the cylinder is: " + getRadius() + 
				", the height of the cylinder is: " + getHeight() +
				", the surface area of the cylinder is: " + getSurfaceArea() + 
				", and the volume of the cylinder is: " + getVolume());
	}
	
	
	

}
