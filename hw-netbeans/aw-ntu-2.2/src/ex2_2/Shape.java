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
public class Shape {
    
    private String color = "red";
    private boolean filled = true;
    
    public Shape() {
	
    }
    
    public Shape(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
    }
    
    public String getColor() {
	return color;
    }
    
    public void setColor(String color) {
	this.color = color;
    }
    
    public boolean isFilled() {
	return filled;
    }
    
    public void setFilled(boolean filled) {
	this.filled = filled;
    }
    
    public String toString() {
	String filled;
	
	if(isFilled() == true) {
	    filled = "";
	}
	else {
	    filled = " not";
	}
	
	return "Color of shape = " + getColor() +
		", shape is" + filled + " filled.";
    }
}
