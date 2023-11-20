import java.util.ArrayList;
import java.util.List;

// Represents a McDonalds burger as a list of components (objects)
public class McDonaldsBurger {
    private List<Object> components;

    public McDonaldsBurger() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Object component) {
        this.components.add(component);
    }

    public List<Object> getBurger() {
        return components;
    }
}
