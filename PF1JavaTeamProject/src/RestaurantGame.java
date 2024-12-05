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


            // show the conditions
            showStatus();
            System.out.println("1. make a cup of coffee 2. make a cake 3. sell the food 4. exit the game");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    getCoffee();
                    break;
                case 2:
                    getCake();
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

    // show the rest and the budget
    private static void showStatus() {
        System.out.println("the number of remaining coffee:" + coffeeStock);
        System.out.println("the number of remaining cakes:" + cakeStock);
        System.out.println("budget:" + money);
    }

    // make coffee
    private static void getCoffee() {
        if (money >= 5) {
            money -= 5;
            coffeeStock++;
            System.out.println("Successfully sell a cup of coffee");
        } else {
            System.out.println("NOT ENOUGH money to make a COFFEE");
        }
    }

    // make cake
    private static void getCake() {
        if (money >= 10) {
            money -= 10;
            cakeStock--;
            System.out.println("Successfully sell a piece of cake");
        } else {
            System.out.println("NOT ENOUGH money to make a CAKE");
        }
    }
private static void selltem2(int choice){
        if (choice==1) {
            money = money + 15;
            System.out.println("Successfully sell a cup of Cappuccino and your budget is " + money);
            System.out.println("The coffeeStock is " + coffeeStock);
        }
        if (choice==2) {
            money = money + 15;
            System.out.println("Successfully sell a cup of Americano and your budget is " + money);
            System.out.println("The coffeeStock is " + coffeeStock);
        }
        if (choice == 3){
            money = money + 16;
            System.out.println ("Successfully sell a cup of Macchiato and your budget is " + money );
            System.out.println("The coffeeStock is" + coffeeStock);
    }
        if (choice == 4) {
            money = money + 16;
            System.out.println("Successfully sell a cup of Latte and your budget is " + money);
            System.out.println("The coffeeStock is" + coffeeStock);
        }
        if (choice == 5){
            money = money +16;
            System.out.println("Successfully sell a cup of Mocha and your budget is" + money);
            System.out.println("The coffeeStock is " + coffeeStock);
        }
}
    // sell the food
    private static void sellItem(Scanner scanner) {
        System.out.println("1. sell a cup of coffee 2. sell a cake");
        int itemChoice = scanner.nextInt();
        if (itemChoice == 1) {
            if (coffeeStock > 0) {
                System.out.println("Which type does the consumer want:1.Cappuccino 2.Americano 3.Macchiato 4.Latte 5.Mocha");
                int choice = scanner.nextInt();
                selltem2(choice);
                coffeeStock--;}
            else {
                System.out.println("COFFEE is SOLD OUT");
            }
        } else if (itemChoice == 2) {
            System.out.println("How many cakes does the consumer want:");
            int need = scanner.nextInt();
            if (cakeStock > need) {
                cakeStock = cakeStock-need;
                money += 15 * need;
                System.out.println("Successfully sell a piece of cake and your budget is"+ money);
            } else {
                System.out.println("CAKE is SOLD OUT");
            }
        } else {
            System.out.println("Invalid selection");
        }
    }
}