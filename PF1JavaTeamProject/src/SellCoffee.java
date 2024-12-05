public class SellCoffee {
    private static int coffeeStock = 89;
    private static int money = 200;
    public static void sellItem2(int choice){
        if (choice==1){
            money=money+15;
            System.out.println("Successfully sell a cup of Cappuccino and your budget is "+money);
            System.out.println("The coffeeStock now is "+coffeeStock);
        }
        if (choice==2){
            money=money+15;
            System.out.println("Successfully sell a cup of Americano and your budget is "+money);
            System.out.println("The coffeeStock now is "+coffeeStock);
        }
        if (choice==3){
            money=money+16;
            System.out.println("Successfully sell a cup of Macchiato and your budget is "+money);
            System.out.println("The coffeeStock now is "+coffeeStock);
        }
        if (choice==4){
            money=money+16;
            System.out.println("Successfully sell a cup of Latte and your budget is "+money);
            System.out.println("The coffeeStock now is "+coffeeStock);
        }
        if (choice==5){
            money=money+16;
            System.out.println("Successfully sell a cup of Mocha and your budget is "+money);
            System.out.println("The coffeeStock now is "+coffeeStock);
        }
    }

}

