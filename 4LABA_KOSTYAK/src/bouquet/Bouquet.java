package bouquet;

import flowers.Flower;
import accessories.Accessory;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bouquet {
    private List<Flower> flowers;
    private List<Accessory> accessories;

    public Bouquet() {
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public double calculateTotalPrice() {
        double flowerPrice = flowers.stream().mapToDouble(Flower::getPrice).sum();
        double accessoryPrice = accessories.stream().mapToDouble(Accessory::getPrice).sum();
        return flowerPrice + accessoryPrice;
    }

    public void sortByFreshness() {
        flowers.sort((f1, f2) -> f2.getFreshness() - f1.getFreshness());
    }

    public List<Flower> findFlowersByStemLength(int minLength, int maxLength) {
        return flowers.stream()
                .filter(f -> f.getStemLength() >= minLength && f.getStemLength() <= maxLength)
                .collect(Collectors.toList());
    }
}
