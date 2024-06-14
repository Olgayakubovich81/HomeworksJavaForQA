package JavaforQA.HW07;
import java.util.ArrayList;
import java.util.List;

public class ProductSearch {

    public static List<Product> filterProducts(List<Product> products, Predicate<Product> predicate) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (predicate.test(product)) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bicycle", 45000, 12));
        products.add(new Product("Scooter", 1500, 10));
        products.add(new Product("Rollers", 2000, 20));
        products.add(new Product("Ski", 22000, 15));
        products.add(new Product("Skateboard", 19000, 4));
        products.add(new Product("Snowboard", 33000, 17));

        // Search for products with a specific price
        Predicate<Product> pricePredicate = new IntegerPredicate(2000);
        List<Product> filteredProducts = filterProducts(products, pricePredicate);

        System.out.println("Products with price 2000:");
        for (Product product : filteredProducts) {
            System.out.println(product);
        }
    }
}
