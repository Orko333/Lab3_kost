package commands;

import bouquet.Bouquet;

public class CreateBouquetCommand implements Command {
    private Bouquet bouquet;

    public CreateBouquetCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute() {
        System.out.println("Створення нового букету...");
    }
}
