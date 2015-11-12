
/**
 * A simple heater.
 * 
 * @author Andrew Wei
 * @version 12/11/15
 */
public class Heater {
    private double temperature;
    private double min;
    private double max;
    private double increment;
    
    public Heater(double minTemp, double maxTemp) {
        temperature = 15.0;
        min = minTemp;
        max = maxTemp;
        increment = 5.0;
    }
    
    public boolean setIncrement(double incValue) {
        if(incValue > 0) {
            increment = incValue;
            return true;
        } 
        else {
            return false;
        }
    }
    
    public void warmer() {
        if(temperature + increment <= max) {
            temperature = temperature + increment;
        }
    }
    
    public void cooler() {
        if(temperature - increment >= min) {
            temperature = temperature - increment;
        }
    }
    
    public double getTemperature() {
        return temperature;
    }
}
