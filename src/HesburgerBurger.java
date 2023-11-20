// represents Hesburger burger as a StringBuilder of components
public class HesburgerBurger {
    private StringBuilder burgerRep;

    public HesburgerBurger() {
        this.burgerRep = new StringBuilder();
    }

    public void addComponent(String component) {
        this.burgerRep.append(component).append(" ");
    }

    public String getBurger() {
        return burgerRep.toString().trim();
    }
}
