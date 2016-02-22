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
public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(int cadence, int speed, int gear, String suspension){
        
	super(cadence, speed, gear);
        this.setSuspension(suspension);
    }

    public String getSuspension(){
      return this.suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has a " +
            getSuspension() + " suspension.");
    }
} 
