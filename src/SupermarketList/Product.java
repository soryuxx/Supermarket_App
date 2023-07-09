package SupermarketList;

import java.util.ArrayList;
import java.util.List;

public class Product {

    public static double price;
    private static String name;
    public static int quantity;
    private List info;


    Product(String name, int quantity) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.info=new ArrayList<>();


    }
    public String toString() {
        String s = this.name + ":";
        s = s + this.quantity + "\n" + this.price + "\n";

        return s;
    }

    public static double getPrice() {
        return price;
    }

    public static String getName() {
        return name;
    }

    public List getInfo() {
        return info;
    }

    public static void setQuantity(int quantity) {
        Product.quantity = quantity;
    }
}
