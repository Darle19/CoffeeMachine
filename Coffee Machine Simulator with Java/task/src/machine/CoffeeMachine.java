package machine;

import java.util.Scanner;


public class CoffeeMachine {
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;
    private int count = 0;

    public boolean makeCoffee(CoffeeType type) {
        CoffeeRecipe r = type.recipe;
        if (water < r.water) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (milk < r.milk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if (beans < r.beans) {
            System.out.println("Sorry, not enough beans!");
            return false;
        }
        if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
            return false;
        }

        water -= r.water;
        milk -= r.milk;
        beans -= r.beans;
        cups--;
        money += r.price;
        count++;

        System.out.println("I have enough resources, making you a coffee!\n");
        return true;
    }

    public boolean needsCleaning() {
        return count >= 10;
    }

    public void clean() {
        count = 0;
        System.out.println("I have been cleaned!");
    }

    public void fill(int addWater, int addMilk, int addBeans, int addCups) {
        water += addWater;
        milk += addMilk;
        beans += addBeans;
        cups += addCups;
    }

    public void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}

