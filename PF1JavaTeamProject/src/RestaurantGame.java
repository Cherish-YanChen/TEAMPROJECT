import java.util.Scanner;
//testing
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
            // 显示当前状态
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

    // 显示当前库存和资金状态
    private static void showStatus() {
        System.out.println("the number of remaining coffee:" + coffeeStock);
        System.out.println("the number of remaining cakes:" + cakeStock);
        System.out.println("budget:" + money);
    }

    // 制作咖啡，消耗成本并增加库存
    private static void makeCoffee() {
        if (money >= 5) {
            money -= 5;
            coffeeStock++;
            System.out.println("Successfully sell a cup of coffee");
        } else {
            System.out.println("NOT ENOUGH money to make a COFFEE");
        }
    }

    // 制作蛋糕，消耗成本并增加库存
    private static void makeCake() {
        if (money >= 10) {
            money -= 10;
            cakeStock++;
            System.out.println("Successfully sell a piece of cake");
        } else {
            System.out.println("NOT ENOUGH money to make a CAKE");
        }
    }

    // 销售商品
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
        }
    }
}