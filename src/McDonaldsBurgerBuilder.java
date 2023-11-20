// Concrete builder for McDonald's burgers
public class McDonaldsBurgerBuilder implements IBurgerBuilder {
    private McDonaldsBurger burger;

    public McDonaldsBurgerBuilder() {
        this.burger = new McDonaldsBurger();
    }

    @Override
    public void addBread(String bread) {
        burger.addComponent(new Bread(bread));
    }

    @Override
    public void addPatty(String patty) {
        burger.addComponent(new Patty(patty));
    }

    @Override
    public void addSalad(String salad) {
        burger.addComponent(new Salad(salad));
    }

    @Override
    public Object getBurger() {
        return burger;
    }
}
