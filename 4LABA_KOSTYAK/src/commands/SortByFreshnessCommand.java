package commands;

import bouquet.Bouquet;

public class SortByFreshnessCommand implements Command {
    private Bouquet bouquet;

    public SortByFreshnessCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute() {
        bouquet.sortByFreshness();
        System.out.println("Квіти відсортовано за свіжістю");
    }
}
