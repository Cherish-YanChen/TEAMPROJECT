import java.util.ArrayList;

public class SellCoffee {
    private static int coffeeStock = 89;
    private static int money = 200;

    public static void sellItem2(int number) {
        if (number >= 1 & number <= 5) {
            money = money + 15;
            coffeeStock--;
            ArrayList<String> list = new ArrayList<>();
            list.add("0.Cappuccino");
            list.add("1.Americano");
            list.add("2.Macchiato");
            list.add("3.Latte");
            list.add("4.Mocha");
            System.out.println("Successfully sell a cup of " + list.get(number) + " and your budget is " + money);
            System.out.println("The coffeeStock now is " + coffeeStock);

        } else {
            System.out.println("Invalid number of type ");
        }
    }
}