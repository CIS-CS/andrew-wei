// StackTester.java
package stack;

/**
 *  StackTester.java
 *  A simple program that uses the Stack class.
 *  @author Mark Hayes
 */
public class StackApp {
    
    public static void main(String[] args) {
        
        // Create the stack object
        Stack s = new Stack();
        
        try {
            
	    s.push(100);
	    s.push(200);
	    s.push(300);
            s.pop();
	    s.push(400);
	    /*
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
	    */
	    
            System.out.println(s.toString());
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        

    }
    
}





