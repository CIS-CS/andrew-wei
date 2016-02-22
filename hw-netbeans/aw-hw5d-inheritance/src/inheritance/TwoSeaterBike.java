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
public class TwoSeaterBike extends Bicycle {

    private int seat1Height;
    private int seat2Height;
    
    public TwoSeaterBike(int cadence, int speed, int gear, int seat1Height, int seat2Height) {
	
	super(cadence, speed, gear);
	this.seat1Height = seat1Height;
	this.seat2Height = seat2Height;
    }
    
    public void setSeat1Height(int seat1Height) {
	
	this.seat1Height = seat1Height;
    }
    
    public void setSeat2Height(int seat2Height) {
	
	this.seat2Height = seat2Height;
    }
    
}
