/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author cgharrity
 *
 */
// Inherits abstract shape class
public class Cuboid extends Shape {
	
	// Defines the width of a cuboid
	private float width = 0.0f;
	
	// Defines the height of a cuboid
	private float height = 0.0f;
	
	// Defines the depth of a cuboid
	private float depth = 0.0f;

	// Gets the width of a cuboid
	public float getWidth() {
		return width;
	}
	
	// Sets the width of a cuboid. Private because there's no reason to make it public.
	// UML diagram says so.
	private void setWidth(float width) {
		this.width = width;
	}

	// Gets the height of the cuboid
	public float getHeight() {
		return height;
	}

	// Sets the height of the cuboid.
	private void setHeight(float height) {
		this.height = height;
	}

	// Gets the depth of the cuboid
	public float getDepth() {
		return depth;
	}

	// Sets the depth of the cuboid
	private void setDepth(float depth) {
		this.depth = depth;
	}
	
	// Creates a new cuboid object 
	public Cuboid(float width, float height, float depth){
		// Sets dimensions of the cuboid 
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}

	// Gets the surface area of the cuboid
	@Override
	public float getSurfaceArea() {
		return 2*(getDepth()*getWidth() + getWidth()*getHeight() + getHeight()*getDepth());
	}
	
	// Gets the volume of the cuboid.
	@Override
	public float getVolume() {
		return getDepth()*getWidth()*getHeight();
	}

	// Displays width, height, depth, surface area, and volume of the cuboid in a 
	// message box.
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "The depth of the cuboid is: " + getDepth() + 
				", the height of the cuboid is: " + getHeight() + 
				", the width of the cuboid is " + getWidth() + 
				", the surface area of the cuboid is: " + getSurfaceArea() +
				", the volume of the cuboid is: " + getVolume());
	}

	

}
