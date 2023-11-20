// Interface for Builders
public interface IBurgerBuilder {
    void addBread(String bread);
    void addPatty(String patty);
    void addSalad(String salad);
    // Add other methods as needed
    Object getBurger();

}
