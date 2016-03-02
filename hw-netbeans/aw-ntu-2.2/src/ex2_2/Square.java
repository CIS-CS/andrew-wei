/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_2;

/**
 *
 * @author Andrew
 */
public class Square extends Rectangle {
    
    public Square() {

    }
    
    public Square(double side) {
	super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
	super(side, side, color, filled);
    }
    
    public double getSide() {
	return super.getLength();
    }
    
    public void setSide(double side) {
	super.setLength(side);
	super.setWidth(side);
    }
    
    public void setWidth(double width) {
	super.setWidth(width);
    }
    
    public void setLength(double length) {
	super.setLength(length);
    }
    
    public String toString() {
	String filled;
	
	if(isFilled() == true) {
	    filled = "";
	}
	else {
	    filled = " not";
	}
	
	return "Square has a side length of " + getSide() + ", its color is " + getColor() + ", and it is " +
		filled + "filled."; 
    }
}
