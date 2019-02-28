import java.util.Random;

public class OrderTracker {

    public static void main(String[] args) {

        System.out.println("Choose a menu item: ");
        System.out.println("Enter 1 for steak");
        System.out.println("Enter 2 for chicken");
        System.out.println("Enter 3 for veggies");

        Random rand = new Random();

        int choice = rand.nextInt(3)+1;

        displayReceipt(foodOption(choice),totalCost(foodOption(choice)));

    }

    public static String foodOption(int choice) {

        String itemName = "none";

        if (choice == 1) {
            itemName = "Ribeye Steak";
        }
        else if (choice == 2) {
            itemName = "Rotisserie chicken";
        }
        else if (choice == 3) {
            itemName = "Roasted veggies";
        }
        else {
            itemName = "none";
        }

        return itemName;

    }

    public static double totalCost(String choice) {

        double cost;

        if (choice.equals("Ribeye Steak")) {
            cost = 20.00;
        }
        else if (choice.equals("Rotisserie chicken")) {
            cost = 15.00;
        }
        else if (choice.equals("Roasted veggies")) {
            cost = 10.00;
        }
        else {
            cost = 0.00;
        }

        return cost;

    }

    public static void displayReceipt(String food, double price) {

        System.out.println("\n");
        System.out.println(food + " " + "$" +price);

    }


}
