package flowers;

public abstract class Flower {
    private String name;
    private double price;
    private int freshness;
    private int stemLength;

    public Flower(String name, double price, int freshness, int stemLength) {
        this.name = name;
        this.price = price;
        this.freshness = freshness;
        this.stemLength = stemLength;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getFreshness() { return freshness; }
    public int getStemLength() { return stemLength; }
}

class Rose extends Flower {
    public Rose(double price, int freshness, int stemLength) {
        super("Троянда", price, freshness, stemLength);
    }
}

class Tulip extends Flower {
    public Tulip(double price, int freshness, int stemLength) {
        super("Тюльпан", price, freshness, stemLength);
    }
}
