/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Andrew
 */
public class TrainingBike extends Bicycle {
    
    private boolean trainingWheels;
    
    public TrainingBike(int cadence, int speed, int gear, boolean trainingWheels) {
	
	super(cadence, speed, gear);
	this.trainingWheels = trainingWheels;
    }
    
    public void addWheels() {
	
	if(trainingWheels == false) {
	    trainingWheels = true;
	}
    }
    
    public void removeWheels() {
	
	if(trainingWheels == true) {
	    trainingWheels = false;
	}
    }
    
    public String hasWheels() {
	
	return (trainingWheels == true) ? "does" : "does not";
    }
    
    public void printDescription() {
	
	super.printDescription();
	System.out.println("The Training Bike " + hasWheels() + " have training wheels.");
    }
}
