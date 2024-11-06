package Main;

import bouquet.Bouquet;
import commands.*;
import menu.FlowerShopMenu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bouquet bouquet = new Bouquet();
        FlowerShopMenu menu = new FlowerShopMenu();

        menu.addCommand("1", new CreateBouquetCommand(bouquet));
        menu.addCommand("2", new ShowBouquetPriceCommand(bouquet));
        menu.addCommand("3", new SortByFreshnessCommand(bouquet));
        menu.addCommand("4", new FindFlowersByLengthCommand(bouquet));

        while (true) {
            System.out.println("\nМеню квіткового магазину:");
            System.out.println("1. Створити букет");
            System.out.println("2. Показати вартість букету");
            System.out.println("3. Відсортувати квіти за свіжістю");
            System.out.println("4. Знайти квіти за довжиною стебла");
            System.out.println("5. Вийти");

            System.out.print("Оберіть опцію: ");
            String choice = scanner.nextLine();

            if (choice.equals("5")) {
                System.out.println("Дякуємо за використання програми!");
                break;
            }

            menu.executeCommand(choice);
        }

        scanner.close();
    }
}
