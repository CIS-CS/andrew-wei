//

public class Animator
{
    // instance variables - replace the example below with your own
    private Person p;
    private Circle circle;
    
    public Animator()
    {
        // initialise instance variables
        p = new Person();
        circle = new Circle();
    }
    
    public void setup() {
        circle.changeColor("red");
        circle.makeVisible();
        p.makeVisible();
    }
    
    public void walkAroundCircle() {
        p.slowMoveHorizontal(60);
        p.slowMoveVertical(-150);
        p.slowMoveHorizontal(-120);
        p.slowMoveVertical(150);
        p.slowMoveHorizontal(60);
    }
}
