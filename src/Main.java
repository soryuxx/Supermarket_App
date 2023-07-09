import SupermarketList.User.User;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User();
        System.out.println("\t Please chose desired option: ");
        System.out.println(" (1) Search Product: \n (2) Search Area: \n (3) Get list of products: " +
                "\n (4) Get info: \n (5) See your cart: \n (6) Remove from cart: \n (7) Add to cart: \n (8) Checkout: \n");
        while (scanner.hasNext()) {
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("What are you searching for? ");
                    // try {
                    scanner.nextLine();
                    // }catch(InputMismatchException e) {
                    //    System.out.println("You can't look for a number in a supermarket");}
                    user.searchProduct(scanner.nextLine());
                    break;
                case "2":
                    System.out.println("What area are you searching for? ");
                    scanner.nextLine();
                    user.searchArea(scanner.nextLine());
                    break;
                case "3":
                    user.getListOfProducts();
                    break;
                case "4":
                    user.getInfo(List.of());
                    break;
                case "5":
                    user.seeCart();
                    break;
                case "6":
                    System.out.println("What product do you want to remove ? ");
                    scanner.nextLine();
                    user.removeFromCart(scanner.nextLine());
                case "7":
                    System.out.println("What product do you want to add ? ");
                    scanner.nextLine();
                    user.addToCart(scanner.nextLine());
                case "8":
                    user.checkout();
                    System.out.println("Thank you. \n " +
                            "See you next time! ");


            }

        }
    }
}