
package physicsapp;

/**
 *
 * @author Andrew
 */
public class Triangle extends Image {
    
    private double base;
    private double height;
    
    public Triangle(int x, int y, double base, double height) {
	
	super(x, y);
	this.base = base;
	this.height = height;
    }
    
    public double getHyp() {
	return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    
    public void setBase(int base) {
	this.base = base;
    }
    
    public void setHeight(int height) {
	this.height = height;
    }
    
    public double getSlope() {
	return height/base;
    }
    
    public double getBase() {
	return base;
    }
    
    public double getHeight() {
	return height;
    }
}
