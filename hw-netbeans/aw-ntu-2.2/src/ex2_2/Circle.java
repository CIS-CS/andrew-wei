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
public class Circle extends Shape {
    
    private double radius = 1.0;
    
    public Circle() {
	
    }
    
    public Circle(double radius) {
	this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
	super(color, filled);
	this.radius = radius;
    }
    
    public double getRadius() {
	return radius;
    }
    
    public void setRadius(double radius) {
	this.radius = radius;
    }
    
    public double getArea() {
	return Math.PI * radius * radius;
    }
    
    public double getPerimeter() {
	return 2 * Math.PI * radius;
    }
    
    public String toString() {
	String filled;
	
	if(isFilled() == true) {
	    filled = "";
	}
	else {
	    filled = " not";
	}
	
	return "Circle has a radius of " + radius + ", area of " + getArea() + 
		", perimeter of " + getPerimeter() + ", its color is " + 
		super.getColor() + ", and it is " + filled + "filled.";
    }
}
