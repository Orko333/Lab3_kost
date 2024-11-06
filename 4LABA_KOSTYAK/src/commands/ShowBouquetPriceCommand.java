package commands;

import bouquet.Bouquet;

public class ShowBouquetPriceCommand implements Command {
    private Bouquet bouquet;

    public ShowBouquetPriceCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute() {
        System.out.println("Загальна вартість букету: " + bouquet.calculateTotalPrice() + " грн");
    }
}
