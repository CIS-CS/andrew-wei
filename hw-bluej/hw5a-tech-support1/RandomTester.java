import java.util.*;

/**
 * Write a description of class RandomTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomTester {

    private Random random;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester() {
        
        random = new Random();
    }
    
    public void printOneRandom() {
       
        System.out.println(random.nextInt());
    }
    
    public void printMultiRandom(int howMany) {
        
        for(int i = 0; i < howMany; i++) {
            System.out.println(random.nextInt());
        }
    }
    
    public int throwDice() {
        
        return random.nextInt(6) + 1;
    }
    
    public String getResponse() {
        ArrayList<String> responses = new ArrayList<String>();
        
        responses.add("Yes");
        responses.add("No");
        responses.add("Maybe");
        
        int ans;
        
        if(responses.size() > 0) {
           ans = random.nextInt(responses.size()); 
        }
        else {
           ans = 0;
        }

        
        return responses.get(ans);
    }
    
    public int maxRandom(int max) {
        return minMaxRandom(1, max);
    }
    
    public int minMaxRandom(int min, int max) {
        int difference = max - min;
        
        if(difference > 0) {
            return random.nextInt(difference + 1) + min ;
        }
        else {
            return 0;
        }
    }
}
