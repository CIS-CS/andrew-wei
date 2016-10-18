/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public Calculator() {
	
	this.mass = 0.0;
	this.friction = 0.0;
	this.slope = 0.0;
	this.velocity = 0.0;
    }
    
    public void findUnknown() {
	
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
    
}
