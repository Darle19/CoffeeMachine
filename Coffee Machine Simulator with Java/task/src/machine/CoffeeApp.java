package machine;

import java.util.Scanner;

public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            String action = input.nextLine();

            switch (action) {
                case "buy":
                    if (machine.needsCleaning()) {
                        System.out.println("I need cleaning!\n");
                        break;
                    }
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = input.nextLine();
                    switch (choice) {
                        case "1": machine.makeCoffee(CoffeeType.ESPRESSO); break;
                        case "2": machine.makeCoffee(CoffeeType.LATTE); break;
                        case "3": machine.makeCoffee(CoffeeType.CAPPUCCINO); break;
                        case "back": break;
                        default: System.out.println("Unknown coffee type");
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int water = input.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int milk = input.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int beans = input.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    int cups = input.nextInt();
                    input.nextLine(); // clear newline
                    machine.fill(water, milk, beans, cups);
                    break;
                case "take":
                    machine.takeMoney();
                    break;
                case "clean":
                    machine.clean();
                    break;
                case "remaining":
                    machine.printState();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
