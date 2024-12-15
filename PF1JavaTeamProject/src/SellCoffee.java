import java.util.ArrayList;

public class SellCoffee {
    private static int coffeeStock = 89;
    private static int money = 200;
    public static void sellItem2(int choice){
        if (choice >= 1 && choice <=5){
            money=money+15;
            coffeeStock--;
            ArrayList<String> list = new ArrayList<>();
            System.out.println("Successfully sell a cup of " + list.get(choice) +" and your budget is " + money);
            System.out.println("The coffeeStock now is " + coffeeStock);
        }else {
            System.out.println("Invalid number of type");
        }
    }

    public static int getCoffeeStock(){
        return coffeeStock;
    }

    public static int getMoney() {
        return money;
    }
}

