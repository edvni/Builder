public class Salad {
    private String type;

    public Salad(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " Salad";
    }
}
