/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicsapp;

/**
 *
 * @author Andrew
 */
public class Square extends Image {
    
    private double side;
    
    public Square(double side, int posX, int posY) {
	
	super(posX, posY);
	this.side = side;
    }
    
    public void setSide(double side) {
	this.side = side;
    }
    
}
