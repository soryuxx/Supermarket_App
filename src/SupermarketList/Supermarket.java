package SupermarketList;

import java.util.HashMap;
import java.util.Map;

public class Supermarket {
    public static double price;
    public static int quantity;
    public static Map<SupermarketArea, Product> vegetablesList = new HashMap<>();
    public static Map<SupermarketArea, Product> fruitList = new HashMap<>();
    public static Map<SupermarketArea, Product> breadList = new HashMap<>();
    public static Map<SupermarketArea, Product> meatList = new HashMap<>();
    public static Map<SupermarketArea, Product> frozenList = new HashMap<>();
    public static Map<SupermarketArea, Product> beverageList = new HashMap<>();
    public static final Map<String, Map<SupermarketArea, Product>> productList = new HashMap<String, Map<SupermarketArea, Product>>();

    public Supermarket() {
        vegetablesList.put(SupermarketArea.VEGETABLES, new Product("Tomatoes", 60));
        vegetablesList.put(SupermarketArea.VEGETABLES, new Product("Cucumbers", 80));
        vegetablesList.put(SupermarketArea.VEGETABLES, new Product("Peppers", 40));
        vegetablesList.put(SupermarketArea.VEGETABLES, new Product("Zuchinis", 60));
        vegetablesList.put(SupermarketArea.VEGETABLES, new Product("Eggplant", 30));

        fruitList.put(SupermarketArea.FRUIT, new Product("Apples", 60));
        fruitList.put(SupermarketArea.FRUIT, new Product("Bananas", 50));
        fruitList.put(SupermarketArea.FRUIT, new Product("Strawberrys", 50));
        fruitList.put(SupermarketArea.FRUIT, new Product("Pineapples", 30));

        breadList.put(SupermarketArea.BREAD, new Product("Bread", 30));
        breadList.put(SupermarketArea.BREAD, new Product("Baguette", 20));
        breadList.put(SupermarketArea.BREAD, new Product("whole grain bread", 60));

        meatList.put(SupermarketArea.MEAT, new Product("Pork", 30));
        meatList.put(SupermarketArea.MEAT, new Product("Chicken", 40));
        meatList.put(SupermarketArea.MEAT, new Product("Beef", 40));

        frozenList.put(SupermarketArea.FROZENAREA, new Product("French fries", 20));
        frozenList.put(SupermarketArea.FROZENAREA, new Product("Ice cream", 40));


        beverageList.put(SupermarketArea.BEVERAGE, new Product("Coca-cola", 20));
        beverageList.put(SupermarketArea.BEVERAGE, new Product("Beer", 20));
        beverageList.put(SupermarketArea.BEVERAGE, new Product("Water", 30));

        productList.put(" ",beverageList);
        productList.put(" ",vegetablesList);
        productList.put(" ",fruitList);
        productList.put(" ",frozenList);
        productList.put(" ",meatList);
        productList.put(" ",breadList);


    }

}



