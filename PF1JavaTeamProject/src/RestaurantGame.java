import java.util.Scanner;
public class RestaurantGame {
    // the number of remaining coffee
    private static int coffeeStock = 89;
    // the number of remaining cakes
    private static int cakeStock = 66;
    // budget
    private static int money = 200;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");

        while (true) {
            // show the conditions
            showStatus();
            System.out.println("1. make a cup of coffee 2. make a cake 3. sell the food 4. exit the game");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    makeCoffee();
                    break;
                case 2:
                    makeCake();
                    break;
                case 3:
                    sellItem(scanner);
                    break;
                case 4:
                    System.out.println("Game Over");
                    return;
                default:
                    System.out.println("Invalid selection,please re-enter");
            }
        }
    }

    // show the rest and the budget
    private static void showStatus() {
        System.out.println("the number of remaining coffee:" + coffeeStock);
        System.out.println("the number of remaining cakes:" + cakeStock);
        System.out.println("budget:" + money);
    }

    // make coffee
    private static void makeCoffee() {
        if (money >= 5) {
            money -= 5;
            coffeeStock++;
            System.out.println("Successfully sell a cup of coffee");
        } else {
            System.out.println("NOT ENOUGH money to make a COFFEE");
        }
    }

    // make cake
    private static void makeCake() {
        if (money >= 10) {
            money -= 10;
            cakeStock++;
            System.out.println("Successfully sell a piece of cake");
        } else {
            System.out.println("NOT ENOUGH money to make a CAKE");
        }
    }

    // sell the food
    private static void sellItem(Scanner scanner) {
        System.out.println("1. sell a cup of coffee 2. sell a cake");
        int itemChoice = scanner.nextInt();
        if (itemChoice == 1) {
            if (coffeeStock > 0) {
                coffeeStock--;
                money += 8;
                System.out.println("Successfully sell a piece of cake");
            } else {
                System.out.println("COFFEE is SOLD OUT");
            }
        } else if (itemChoice == 2) {
            if (cakeStock > 0) {
                cakeStock--;
                money += 15;
                System.out.println("Successfully sell a piece of cake");
            } else {
                System.out.println("CAKE is SOLD OUT");
            }
        } else {
            System.out.println("Invalid selection");
        //make and sell the coffee
            //now the coffee is sold out
            int count = 0;
            //I made a new cup of coffee
            count = count + 1;
            //Then I sold it
            count = count - 1;
            //I made 5 cups of coffee, and sold 2 of them
            count = count + 5 - 2;
            //the number of the cup of coffee I have now
            System.out.println(count);

        }
    }
}