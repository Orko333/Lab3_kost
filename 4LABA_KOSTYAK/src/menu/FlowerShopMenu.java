package menu;

import commands.Command;
import java.util.HashMap;
import java.util.Map;

public class FlowerShopMenu {
    private Map<String, Command> commands;

    public FlowerShopMenu() {
        commands = new HashMap<>();
    }

    public void addCommand(String name, Command command) {
        commands.put(name, command);
    }

    public void executeCommand(String name) {
        Command command = commands.get(name);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Команду не знайдено!");
        }
    }
}
