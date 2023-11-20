// Concrete builder for Hesburger's burgers
public class HesburgerBurgerBuilder implements IBurgerBuilder {

    private HesburgerBurger burger;

    public HesburgerBurgerBuilder() {
        this.burger = new HesburgerBurger();
    }
    @Override
    public void addBread(String bread) {
        burger.addComponent("Bread: " + bread + ",");
    }

    @Override
    public void addPatty(String patty) {
        burger.addComponent("Patty: " + patty + ",");
    }

    @Override
    public void addSalad(String salad) {
        burger.addComponent("Salad: " + salad);
    }

    @Override
    public Object getBurger() {
        return burger;
    }
}
