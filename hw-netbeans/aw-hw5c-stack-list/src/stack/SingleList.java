/*
 *  SingleList.java
 *  From page 288-290 in the red book. (Llist.java)
 * 
 *  1. SingleList is a singly-linked list with a HEAD pointer and a
 *     TAIL pointer.
 *  2. Each item in the list is a SingleNode object;
 *     SingleNode objects contain integer data.
 *     SingleNode objects are stored in ascending order in the list.
 *  3. Duplicate entries in the list are ok.
 */

package stack;

public class SingleList
{   
    private SingleNode head = null;
    private SingleNode tail = null;
    private SingleNode current = null;
    
    /**
     *  Add a node to the list (in ascending order).
     *  Four possibilities: 
     *  1. the list is empty; start a new list. 
     *  2. add to the front of the list. 
     *  3. add to the end of the list.
     *  4. insert into the middle of the list.     
     */ 
    public void add(int data) {
        
        SingleNode newNode = new SingleNode(data);
        current = null;

        // The list is empty, start a new list
        if (head == null) {            
            newNode.setNext(null);
            head = newNode;
            tail = newNode;
	    current = tail;
        }

        // Add to the end of the list
        else { 
            newNode.setNext(null);              
            tail.setNext(newNode);
            tail = newNode;
	    current = tail;
        }
    }

    /**
     *  Remove a node from the list.
     *  Three possibilities:
     *  1. the list is empty; report node not found (throw Exception).
     *  2. list has one node; remove node, set H,T to null;
     *  3. list has more than one node; 
     *     see if it is the first node
     *     if not, check the embedded nodes, up to the last one.
     *     check the last node
     *  Since the list is singly-linked, it is necessary to maintain a reference
     *  back to the previous node. 
     */
    public void remove() throws Exception {        
        
        if (isEmpty()) {
            throw new Exception("Value not found.");
        }
        
	else {
	    while(head.getNext().getNext() != null) {
		current = head.getNext();
	    }
	    
	    tail = current;
	    tail.setNext(null);
	}
    }
    
    /**
     * Return the size of the list.
     * @return the size of the list.
     */
    public int size()
    {
        int result = 0;
        SingleNode current = head;
        
        while (current != null)
        {
            result++;
            current = current.getNext();
        }
        return result;
    }
    
    /**
     * Return a string representation of the list.
     */ 
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        
        SingleNode current = head;
        while (current != null) {
            sb.append(current.getData());
            sb.append(" ");
            current = current.getNext();
        }
        return "List = " + sb.toString();
    }
    
    public boolean isEmpty() {
        return (head == null && tail == null) ? true : false;
    }
}






