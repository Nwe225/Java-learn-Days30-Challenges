import java.util.Scanner;

public class ShoppingCart{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine().trim();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        String itemLabel = (quantity == 1) ? item : item + "s";

        System.out.println();
        System.out.println("You have bought " + quantity + " " + itemLabel + ".");
        System.out.println("Your total is " + currency + String.format("%.2f", total));

        scanner.close();
    }
}
