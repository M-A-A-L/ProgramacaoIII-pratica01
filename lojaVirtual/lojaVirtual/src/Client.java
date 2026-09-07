import factory.CompFactory;
import factory.PlayFactory;
import factory.ProductFactory;
import products.Product;

public class Client {
    public static void main(String[] args) {
        ProductFactory compFactory = new CompFactory();
        ProductFactory playFactory = new PlayFactory();

        Product product = compFactory.orderProduct("Notebook", "ASUS", 4500);
        product = compFactory.orderProduct("Computer", "ASUS", 7650);
        product = playFactory.orderProduct("Playstation", "Playstation 2", 450);
        product = playFactory.orderProduct("PlaystationPortable", "PSP", 200);
    }
}