
package javaapplication3;

public class Main {

    public static void main(String[] args) {
        
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        
        RestaurantAbstractFactory restaurantAbstractFactory1 = restaurantFactoryProducer.getRestaurantAbstractFactory(1);
        System.out.println(restaurantAbstractFactory1);
        System.out.println(restaurantAbstractFactory1.getFastfood("hamburguer"));
        System.out.println(restaurantAbstractFactory1.getFastfood("sandwich"));
        System.out.println(restaurantAbstractFactory1.getFastfood("hot dog"));
        System.out.println(restaurantAbstractFactory1.getFastfood(""));
        System.out.println(restaurantAbstractFactory1.getDrink("soda"));
        System.out.println(restaurantAbstractFactory1.getDrink(""));
        
        RestaurantAbstractFactory restaurantAbstractFactory2 = restaurantFactoryProducer.getRestaurantAbstractFactory(2);
        System.out.println(restaurantAbstractFactory2);
        System.out.println(restaurantAbstractFactory2.getFastfood("pizza"));
        System.out.println(restaurantAbstractFactory2.getFastfood(""));
        System.out.println(restaurantAbstractFactory2.getDrink("juice"));
        System.out.println(restaurantAbstractFactory2.getDrink("beer"));
        System.out.println(restaurantAbstractFactory2.getDrink(""));
        
    }
    
}
