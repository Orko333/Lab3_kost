package commands;

import bouquet.Bouquet;

public class FindFlowersByLengthCommand implements Command {
    private Bouquet bouquet;

    public FindFlowersByLengthCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute() {
        System.out.println("Пошук квітів за довжиною стебла...");
    }
}
