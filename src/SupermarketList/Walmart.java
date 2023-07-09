package SupermarketList;

import java.util.HashMap;
import java.util.Map;

public class Walmart {
    public static double price;
    public static int quantity;
    public static Map<SupermarketArea,Product> productList = new HashMap<SupermarketArea,Product>();

    public Walmart() {
        productList.put(SupermarketArea.VEGETABLES, new Product("Tomatoes", 40));
        productList.put(SupermarketArea.VEGETABLES, new Product("Cucumbers", 40));
        productList.put(SupermarketArea.VEGETABLES, new Product("Peppers", 30));
        productList.put(SupermarketArea.VEGETABLES, new Product("Zuchinis", 50));
        productList.put(SupermarketArea.VEGETABLES, new Product("Eggplant", 20));

        productList.put(SupermarketArea.FRUIT, new Product("Apples", 30));
        productList.put(SupermarketArea.FRUIT, new Product("Bananas", 20));
        productList.put(SupermarketArea.FRUIT, new Product("Strawberrys", 20));
        productList.put(SupermarketArea.FRUIT, new Product("Pineapples", 10));

        productList.put(SupermarketArea.BREAD, new Product("Bread", 20));
        productList.put(SupermarketArea.BREAD, new Product("Baguette", 15));
        productList.put(SupermarketArea.BREAD, new Product("whole grain bread", 15));

        productList.put(SupermarketArea.MEAT, new Product("Pork", 30));
        productList.put(SupermarketArea.MEAT, new Product("Chicken", 40));
        productList.put(SupermarketArea.MEAT, new Product("Beef", 40));

        productList.put(SupermarketArea.FROZENAREA, new Product("French fries", 20));
        productList.put(SupermarketArea.FROZENAREA, new Product("Ice cream", 40));


        productList.put(SupermarketArea.BEVERAGE, new Product("Coca-cola", 20));
        productList.put(SupermarketArea.BEVERAGE, new Product("Beer", 20));
        productList.put(SupermarketArea.BEVERAGE, new Product("Water", 30));

    }

}


