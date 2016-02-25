
package stack;
import java.util.Arrays;
import java.io.File;

/**
 *  Implements a stack in an array (a static stack).
 *  The stack pointer (SP) points to the top item in the stack.
 *  When SP == 0, it is pointing the bottom item in the stock.
 *  If the stack is empty, SP == -1.
 * 
 *  On push, SP is incremented, then the data is added at SP.
 *  On pop,  the data is removed, then SP is decremented.
 */
public class Stack {
    
    // Stack and stack pointer
    private SingleList stack = null;    // Stack

    /**
     * Initializes the stack.
     * @param stackSize
     */
    public Stack() {
        stack = new SingleList();
    }

    /**
     * Add an element to top of stack.
     */
    public void push(int data) {

        stack.add(data);
    }
    
    /**
     * Remove top element from the stack.
     */
    public void pop() {
		
	if (stack.size() != 0) {
            stack.remove();
        }
	else {
	    System.out.println("Nothing to remove!");
	}   
    }
    
    /**
     * Return true if stack is empty.
     * @return <code>true</code> if the stack is empty.
     */
    public boolean isEmpty() {
	if (stack == null) {  
	    return true;
        }
        else {
            return false;
        }
    }    

    /**
     * Get the size of the stack.
     * @return The size of the stack.
     */
    public int size() {

        return stack.size();
    }
    
    /**
     * Converts the stack to a String, with the top item on the left.
     * @return The stack in the form of a String.
     */
    public String toString() {
        
	return (size() != 0) ? stack.toString() : "List is empty.";
    }
}






































