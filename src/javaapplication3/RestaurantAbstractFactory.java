
package javaapplication3;

public abstract class RestaurantAbstractFactory {
    
    abstract public FastFood getFastfood(String type);
    
    abstract public Drink getDrink(String type);
    
}
