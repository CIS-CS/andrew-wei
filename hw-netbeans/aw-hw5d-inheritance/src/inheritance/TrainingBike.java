/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Andrew
 */
public class TrainingBike extends Bicycle {
    
    private boolean trainingWheels;
    
    public TrainingBike(boolean trainingWheels, int cadence, int speed, int gear) {
	
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
}
