import  java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? : ");
        item = scanner.nextLine();
        System.out.println(item);

        System.out.print("What is the price of each? :");
        price = scanner.nextDouble();
        System.out.println(price);

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        System.out.println(quantity);

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity  + " " + item + "/s");
        System.out.println("Your total is " + currency + total);


        scanner.close();

    }
}
