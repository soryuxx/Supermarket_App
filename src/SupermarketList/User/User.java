package SupermarketList.User;
import SupermarketList.Product;
import SupermarketList.Supermarket;
import SupermarketList.SupermarketArea;
import SupermarketList.Walmart;

import java.util.List;



public class User implements UserOperation {
    public double userMoney;


    @Override
    public void searchProduct(String s) {
        if (Walmart.productList.containsValue(s))
            System.out.println("The product is available in the Supermarket");
        else
            System.out.println("The product is not available in the Supermarket");
    }

    @Override
    public boolean searchArea(String s) {
        for (SupermarketArea a : SupermarketArea.values()) {
            try {
                SupermarketArea.valueOf(s);
                return true;
            } catch (Exception e) {
            }
        }
        return false;
    }


        @Override
        public void getListOfProducts () {
            System.out.println(Supermarket.productList.values().toString());
        }


        @Override
        public void getInfo (List info){
            for (int i = 0; i < info.size(); i++)
                System.out.println(info.toString());

        }

        @Override
        public Supermarket buy (Supermarket product,int quantity){
            if (userMoney >= Product.price) {
                Product.quantity--;
                Supermarket.productList.remove(product);
            } else {
                System.out.println("Product not available. ");


            }
            return null;
        }

        @Override
        public void seeCart () {
            for (int i = 0; i < Cart.product.size(); i++)
                System.out.println(Cart.product.get(i).toString());
        }

        @Override
        public void removeFromCart (String product){
            Cart.product.remove(product);
            System.out.println("You removed : " + product);
            System.out.println("Updated List: " + Cart.product.toString());

        }

        @Override
        public void removeMore () {
            System.out.println("List: " + Cart.product);
            Cart.product.removeAll(Cart.removeFromCart);
            System.out.println("Updated List: " + Cart.product.toString());

        }

        @Override
        public void addToCart (String product){
            Cart.product.add(String.valueOf(product));
            System.out.println("You added: " + product);

        }

        public void checkout () {
            System.out.println("List: " + Cart.product.toString());
            System.out.print("Total price: ");
            int TotalPrice = 0;
            for (String p : Cart.product) {
                TotalPrice += Product.getPrice();
                System.out.println(TotalPrice);

            }
        }
    }