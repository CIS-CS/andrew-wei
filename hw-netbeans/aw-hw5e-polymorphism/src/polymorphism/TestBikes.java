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
public class TestBikes {
  
    public static void main(String[] args){
    
	Bicycle bike01, bike02, bike03, bike04, bike05;

	bike01 = new Bicycle(20, 10, 1);
	bike02 = new MountainBike(20, 10, 5, "dual");
	bike03 = new RoadBike(40, 20, 8, 23);
	bike04 = new TrainingBike(10, 5, 1, true);
	bike05 = new TwoSeaterBike(20, 15, 2, 8, 10);

	bike01.printDescription();
	bike02.printDescription();
	bike03.printDescription();
	bike04.printDescription();
	bike05.printDescription();

    
    }
}
