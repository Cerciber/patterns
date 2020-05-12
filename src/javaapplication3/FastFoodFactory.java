
package javaapplication3;

public class FastFoodFactory {
    
    public FastFood getFastfood(String type) {
        switch (type) {
            case "hamburguer":
                return new Hamburger();
            case "sandwich":
                return new Sandwich();
            case "hot dog":
                return new HotDog();
            default:
                return null;
        }
    }
    
}
