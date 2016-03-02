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
public class Rectangle extends Shape {
    
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle() {
	
    }
    
    public Rectangle(double width, double length) {
	this.width = width;
	this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled) {
	super(color, filled);
	this.width = width;
	this.length = length;
    }
    
    public double getWidth() {
	return width;
    }
    
    public void setWidth(double width) {
	this.width = width;
    }
    
    public double getLength() {
	return length;
    }
    
    public void setLength(double length) {
	this.length = length;
    }
    
    public double getArea() {
	return length * width;
    }
    
    public double getPerimeter() {
	return 2 * length + 2 * width;
    }
    
    public String toString() {
	String filled;
	
	if(isFilled() == true) {
	    filled = "";
	}
	else {
	    filled = " not";
	}
	
	return "Rectangle has a length of " + getLength() + ", a width of " +
		getWidth() + ", an area of " + getArea() + ", and a perimeter of " + 
		getPerimeter() + ". Its color is " + getColor() + ", and it is " +
		filled + "filled.";
    }
}
