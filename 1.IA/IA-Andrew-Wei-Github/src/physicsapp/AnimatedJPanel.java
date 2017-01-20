
package physicsapp;

/**
 *
 * @author Andrew
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimatedJPanel extends JPanel {
    
    private int squareX1;
    private int squareX2;
    private int squareX3;
    private int squareX4;
    private int squareY1;
    private int squareY2;
    private int squareY3;
    private int squareY4;
    
    private int triangleX1;
    private int triangleX2;
    private int triangleX3;
    private int triangleY1;
    private int triangleY2;
    private int triangleY3;
    
    private int slope;
    private int friction;
    private int mass;
    
    private int delay = 6 + (friction * 2); //milliseconds
    
    private boolean stop = false;
    
    //Default sliding
    ActionListener counter = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
	    move(slope, friction, mass);
	}
    };
	
    Timer t = new Timer(delay, counter);
    
    
    public AnimatedJPanel() {

	// Vertices: 1 = top, 2 = left, 3 = bottom, 4 = right
	// For the default triangle
	triangleX1 = 111;
	triangleX2 = 211;
	triangleX3 = 211;
	
	triangleY1 = 271;
	triangleY2 = 271;
	triangleY3 = 171;
	
	squareX1 = triangleX3 - 28;
	squareX2 = triangleX3 - 28 - 28;
	squareX3 = triangleX3 - 28;
	squareX4 = triangleX3;
	
	squareY1 = triangleY3 - 28;
	squareY2 = triangleY3;
	squareY3 = triangleY3 - 28 + 28 + 28;
	squareY4 = triangleY3;
    }
    
    @Override
    public void paintComponent(Graphics g) {	
        super.paintComponent(g);

	Color blue = new Color(30, 144, 255);
	Color green = new Color(50, 205, 50);
	Color brown = new Color(160, 82, 45);
	
	g.setColor(blue);
	g.fillPolygon(new int[] {squareX1, squareX2, squareX3, squareX4}, 
			new int[] {squareY1, squareY2, squareY3, squareY4}, 4);
	g.setColor(Color.BLACK);
	g.drawPolygon(new int[] {squareX1, squareX2, squareX3, squareX4}, 
			new int[] {squareY1, squareY2, squareY3, squareY4}, 4);

        g.setColor(green);
        g.fillPolygon(new int[] {triangleX1, triangleX2, triangleX3}, 
			new int[] {triangleY1, triangleY2, triangleY3}, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(new int[] {triangleX1, triangleX2, triangleX3}, 
			new int[] {triangleY1, triangleY2, triangleY3}, 3);
	
	//Draw floor
	g.setColor(brown);
	g.fillRect(0, 271, 325, 18);
	g.setColor(Color.BLACK);
	g.drawLine(0, 271, 325, 271);

    }
    
    public void reset() {
	
	if(slope == 0) {
	    //Nothing
	}
	else if(slope == 1) {
	
	    squareX1 = triangleX3 - 18;
	    squareX2 = triangleX3 - 18 - 36;
	    squareX3 = triangleX3 - 36;
	    squareX4 = triangleX3;

	    squareY1 = triangleY3 - 36;
	    squareY2 = triangleY3 - 36 + 18;
	    squareY3 = triangleY3 - 36 + 18 + 36;
	    squareY4 = triangleY3;
	}
	else if(slope == 2) {
	    
	    squareX1 = triangleX3 - 22;
	    squareX2 = triangleX3 - 22 - 33;
	    squareX3 = triangleX3 - 33;
	    squareX4 = triangleX3;

	    squareY1 = triangleY3 - 33;
	    squareY2 = triangleY3 - 33 + 22;
	    squareY3 = triangleY3 - 33 + 22 + 33;
	    squareY4 = triangleY3;
	}
	else if(slope == 3) {
	    
	    squareX1 = triangleX3 - 28;
	    squareX2 = triangleX3 - 28 - 28;
	    squareX3 = triangleX3 - 28;
	    squareX4 = triangleX3;

	    squareY1 = triangleY3 - 28;
	    squareY2 = triangleY3;
	    squareY3 = triangleY3 - 28 + 28 + 28;
	    squareY4 = triangleY3;
	}
	else if(slope == 4) {
	    
	    squareX1 = triangleX3 - 33;
	    squareX2 = triangleX3 - 33 - 22;
	    squareX3 = triangleX3 - 22;
	    squareX4 = triangleX3;

	    squareY1 = triangleY3 - 22;
	    squareY2 = triangleY3 - 22 + 33;
	    squareY3 = triangleY3 - 22 + 33 + 22;
	    squareY4 = triangleY3;
	}
	else if(slope == 5) {
	    
	    squareX1 = triangleX3 - 36;
	    squareX2 = triangleX3 - 36 - 18;
	    squareX3 = triangleX3 - 18;
	    squareX4 = triangleX3;

	    squareY1 = triangleY3 - 18;
	    squareY2 = triangleY3 - 18 + 36;
	    squareY3 = triangleY3 - 18 + 36 + 18;
	    squareY4 = triangleY3;
	}
	
	
	t.stop();
	stop = false;
	
	repaint();
    }
    
    public void resetAll() {
	
	squareX1 = 211;
	squareY1 = 171;
	
	adjustTriangle1();
	
	t.stop();
	stop = false;
    }
    
    public void slide() {
		
	t.start();
	
    }
    
    public void inputValues(int slope, int friction, int mass) {
	
	this.slope = slope;
	this.friction = friction;
	this.mass = mass;
    }
    
    private void move(int slope, int friction, int mass) {
	
	if(slope == 0 || mass == 0) {
	    //Nothing
	}
	else if(slope == 1 && stop == false && squareY3 + 1 <= 271) {
	    	    
	    squareX1 = squareX1 - 2;
	    squareX2 = squareX2 - 2;
	    squareX3 = squareX3 - 2;
	    squareX4 = squareX4 - 2;
	    
	    squareY1 = squareY1 + 1;
	    squareY2 = squareY2 + 1;
	    squareY3 = squareY3 + 1;
	    squareY4 = squareY4 + 1;
	    
	    repaint();
	}
	else if(slope == 2 && stop == false && squareY3 + 1 <= 271) {
	    	    
	    squareX1 = squareX1 - 3;
	    squareX2 = squareX2 - 3;
	    squareX3 = squareX3 - 3;
	    squareX4 = squareX4 - 3;
	    
	    squareY1 = squareY1 + 2;
	    squareY2 = squareY2 + 2;
	    squareY3 = squareY3 + 2;
	    squareY4 = squareY4 + 2;
	    
	    repaint();
	}
	else if(slope == 3 && stop == false && squareY3 + 1 <= 271) {
	    	    
	    squareX1 = squareX1 - 1;
	    squareX2 = squareX2 - 1;
	    squareX3 = squareX3 - 1;
	    squareX4 = squareX4 - 1;
	    
	    squareY1 = squareY1 + 1;
	    squareY2 = squareY2 + 1;
	    squareY3 = squareY3 + 1;
	    squareY4 = squareY4 + 1;
	    
	    repaint();
	} 
	else if(slope == 4 && stop == false && squareY3 + 1 <= 271) {
	    	    
	    squareX1 = squareX1 - 2;
	    squareX2 = squareX2 - 2;
	    squareX3 = squareX3 - 2;
	    squareX4 = squareX4 - 2;
	    
	    squareY1 = squareY1 + 3;
	    squareY2 = squareY2 + 3;
	    squareY3 = squareY3 + 3;
	    squareY4 = squareY4 + 3;
	    
	    repaint();
	}
	else if(slope == 5 && stop == false && squareY3 + 1 <= 271) {
	    	    	    
	    squareX1 = squareX1 - 1;
	    squareX2 = squareX2 - 1;
	    squareX3 = squareX3 - 1;
	    squareX4 = squareX4 - 1;
	    
	    squareY1 = squareY1 + 2;
	    squareY2 = squareY2 + 2;
	    squareY3 = squareY3 + 2;
	    squareY4 = squareY4 + 2;
	    
	    repaint();
	} 
	else {
	    stop = true;
	}

    }

    
    //Shape resizing methods:
    public void adjustTriangle0() {
	
	triangleX1 = 61;
	triangleX2 = 261;
	triangleX3 = 261;
	
	triangleY1 = 271;
	triangleY2 = 271;
	triangleY3 = 271;
	
	squareX1 = triangleX3;
	squareX2 = triangleX3 - 40;
	squareX3 = triangleX3 - 40;
	squareX4 = triangleX3;
	
	squareY1 = triangleY3 - 40;
	squareY2 = triangleY3 - 40;
	squareY3 = triangleY3;
	squareY4 = triangleY3;
	
	t.stop();

	// No timer because no animation
	
	repaint();
    }
    
    public void adjustTriangleHalf() {
	
	triangleX1 = 61;
	triangleX2 = 261;
	triangleX3 = 261;
	
	triangleY1 = 271;
	triangleY2 = 271;
	triangleY3 = 171;
	
	squareX1 = triangleX3 - 18;
	squareX2 = triangleX3 - 18 - 36;
	squareX3 = triangleX3 - 36;
	squareX4 = triangleX3;
	
	squareY1 = triangleY3 - 36;
	squareY2 = triangleY3 - 36 + 18;
	squareY3 = triangleY3 - 36 + 18 + 36;
	squareY4 = triangleY3;
	
	t.stop();
	delay = 12 + (friction * 2);
	t = new Timer(delay, counter);
	
	stop = false;
	
	repaint();
    }
    
    public void adjustTriangle2over3() {
	
	triangleX1 = 86;
	triangleX2 = 236;
	triangleX3 = 236;
	
	triangleY1 = 271;
	triangleY2 = 271;
	triangleY3 = 171;
	
	squareX1 = triangleX3 - 22;
	squareX2 = triangleX3 - 22 - 33;
	squareX3 = triangleX3 - 33;
	squareX4 = triangleX3;
	
	squareY1 = triangleY3 - 33;
	squareY2 = triangleY3 - 33 + 22;
	squareY3 = triangleY3 - 33 + 22 + 33;
	squareY4 = triangleY3;
	
	t.stop();
	delay = 18 + (friction * 4);
	t = new Timer(delay, counter);
	
	stop = false;
	
	repaint();
    }
    
    public void adjustTriangle1() {
	
	triangleX1 = 111;
	triangleX2 = 211;
	triangleX3 = 211;
	
	triangleY1 = 271;
	triangleY2 = 271;
	triangleY3 = 171;
	
	squareX1 = triangleX3 - 28;
	squareX2 = triangleX3 - 28 - 28;
	squareX3 = triangleX3 - 28;
	squareX4 = triangleX3;
	
	squareY1 = triangleY3 - 28;
	squareY2 = triangleY3;
	squareY3 = triangleY3 - 28 + 28 + 28;
	squareY4 = triangleY3;
	
	t.stop();
	delay = 6 + (friction * 2);
	t = new Timer(delay, counter);
	
	stop = false;
	
	repaint();
    }
    
    public void adjustTriangle3over2() {
	
	triangleX1 = 111;
	triangleX2 = 211;
	triangleX3 = 211;
	
	triangleY1 = 271;
	triangleY2 = 271;
	triangleY3 = 121;
	
	squareX1 = triangleX3 - 33;
	squareX2 = triangleX3 - 33 - 22;
	squareX3 = triangleX3 - 22;
	squareX4 = triangleX3;
	
	squareY1 = triangleY3 - 22;
	squareY2 = triangleY3 - 22 + 33;
	squareY3 = triangleY3 - 22 + 33 + 22;
	squareY4 = triangleY3;
	
	t.stop();
	delay = 9 + (friction * 4);
	t = new Timer(delay, counter);
	
	stop = false;
	
	repaint();
    }
    
    public void adjustTriangle2() {
	
	triangleX1 = 111;
	triangleX2 = 211;
	triangleX3 = 211;
	
	triangleY1 = 271;
	triangleY2 = 271;
	triangleY3 = 71;
	
	squareX1 = triangleX3 - 36;
	squareX2 = triangleX3 - 36 - 18;
	squareX3 = triangleX3 - 18;
	squareX4 = triangleX3;
	
	squareY1 = triangleY3 - 18;
	squareY2 = triangleY3 - 18 + 36;
	squareY3 = triangleY3 - 18 + 36 + 18;
	squareY4 = triangleY3;
	
	t.stop();
	delay = 3 + (friction * 2);
	t = new Timer(delay, counter);
	
	stop = false;
	
	repaint();
    }
    
}
