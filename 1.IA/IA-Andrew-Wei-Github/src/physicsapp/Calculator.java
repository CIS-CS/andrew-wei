
package physicsapp;

/**
 *
 * @author Andrew
 */
public class Calculator {
    
    private double mass;
    private double friction;
    private double slope;
    private double velocity;
    private String unknown;
    
    public Calculator() {
	
	this.mass = 1.0;
	this.friction = 1.0;
	this.slope = 1.0;
	this.velocity = 1.0;
	this.unknown = "";
    }
    
    public Calculator(double mass, double friction, double slope, double velocity, String unknown) {
	
	this.mass = mass;
	this.friction = friction;
	this.slope = slope;
	this.velocity = velocity;
	this.unknown = unknown;
    }
    
    public double getMass() {
	return mass;
    }
    
    public double getFriction() {
	return friction;
    }
    
    public double getVelocity() {
	return velocity;
    }
    
    public double getSlope() {
	return slope;
    }
    
    public String getUnknown() {
	return unknown;
    }
    
    public double calcNewMass(double mass) { 
	return mass;
    }
    
    public double calcNewFriction(double friction) {
	return friction;
    }
    
    public double calcNewVelocity(double velocity) {
	return velocity;
    }
    
    public double calcNewSlope(double slope) { 
	return slope;
    }
    
}
