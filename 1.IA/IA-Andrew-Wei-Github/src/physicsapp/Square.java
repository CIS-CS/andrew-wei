
package physicsapp;

/**
 *
 * @author Andrew
 */
public class Square extends Image {
    
    private double side;
    
    public Square(int x, int y, double side) {
	
	super(x, y);
	this.side = side;
    }
    
    public void setSide(double side) {
	this.side = side;
    }
    
    public double getSide() {
	return side;
    }
}
