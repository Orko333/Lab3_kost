package accessories;

public class Accessory {
    private String name;
    private double price;

    public Accessory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
}