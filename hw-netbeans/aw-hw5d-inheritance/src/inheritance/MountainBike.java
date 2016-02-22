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
public class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    private int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int seatHeight, int cadence, int speed, int gear) {
        
	super(cadence, speed, gear);
        this.seatHeight = seatHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int seatHeight) {
        
	this.seatHeight = seatHeight;
    }   
}
