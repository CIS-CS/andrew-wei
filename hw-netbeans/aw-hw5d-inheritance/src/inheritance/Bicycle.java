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
public class Bicycle {
        
    // the Bicycle class has three fields
    private int cadence;
    private int gear;
    private int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int cadence, int speed, int gear) {
        this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int cadence) {
        this.cadence = cadence;
    }
        
    public void setGear(int gear) {
        this.gear = gear;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}

