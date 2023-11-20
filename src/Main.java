public class Main {
    public static void main(String[] args) {
        // Create a McDonaldsBurger using McDonaldsBurgerBuilder
        IBurgerBuilder mcdonaldsBuilder = new McDonaldsBurgerBuilder();
        mcdonaldsBuilder.addBread("Sesame Seed");   // add components to the builder
        mcdonaldsBuilder.addPatty("Beef");
        mcdonaldsBuilder.addSalad("Lettuce");

        McDonaldsBurger mcdonaldsBurger = (McDonaldsBurger) mcdonaldsBuilder.getBurger();      // get the burger from the builder
        System.out.println("ArrayList McDonald's Burger: " + mcdonaldsBurger.getBurger());        // print the constructed burger

        // Create a HesburgerBurger using HesburgerBurgerBuilder
        IBurgerBuilder hesburgerBuilder = new HesburgerBurgerBuilder();
        hesburgerBuilder.addBread("Rye Bun");
        hesburgerBuilder.addPatty("Chicken");
        hesburgerBuilder.addSalad("Iceberg Lettuce");

        HesburgerBurger hesburgerBurger = (HesburgerBurger) hesburgerBuilder.getBurger();       // get the burger from the builder
        System.out.println("StringBuilder Hesburger Burger: " + hesburgerBurger.getBurger());     // print the constructed burger
    }
}
