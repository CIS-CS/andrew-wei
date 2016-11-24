
package physicsapp;

/**
 *
 * @author Andrew
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimatedJPanel extends JPanel {
   
    public int x = 10;	//Start Drawing from X=10	
    public int delay = 500; 	//milliseconds
    
    public AnimatedJPanel() {
	
	ActionListener counter = new ActionListener() {
	    public void actionPerformed(ActionEvent evt) { 
		repaint();
		x++;
	    }};
	    
	new Timer(delay, counter).start();
    }
    
    @Override
    public void paintComponent(Graphics g) {
	/*super.paintComponent(g);

	g.setColor(Color.cyan);
	g.fillRect(x,40,50,50);

	g.setColor(Color.red);
	g.fillRect(x,100,50,50);

	g.setColor(Color.green);
	g.fillRect(x,160,50,50);

	g.setColor(Color.blue);
	g.fillRect(x,220,50,50);

	g.setColor(Color.yellow);
	g.fillRect(x,280,50,50);*/
	
	
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        //g2d.rotate(Math.toRadians(-45));
        Color blue = new Color(2003199);
        Color green = new Color(3329330);

        g.setColor(blue);
        g.fillRect(171, 131, 40, 40);
        g.setColor(Color.BLACK);
        g.drawRect(171, 131, 40, 40);

        //g2d.rotate(Math.toRadians(45));
        g.setColor(green);
        g.fillPolygon(new int[] {111, 211, 211}, new int[] {271, 271, 171}, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(new int[] {111, 211, 211}, new int[] {271, 271, 171}, 3);
    }
    
    public void clear() {
	super.repaint();
    }
	
}
