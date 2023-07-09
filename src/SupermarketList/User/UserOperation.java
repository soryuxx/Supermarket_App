package SupermarketList.User;
import SupermarketList.Product;
import SupermarketList.Supermarket;
import java.util.List;
import java.util.Scanner;

public interface UserOperation {
void searchProduct(String product);
boolean searchArea(String input);
void getListOfProducts();
void getInfo(List info);
Supermarket buy(Supermarket product, int quantity);
void seeCart();
void removeFromCart(String product);
void removeMore();
void addToCart(String input);
void checkout();

}
