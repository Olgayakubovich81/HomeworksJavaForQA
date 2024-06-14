package JavaforQA.HW07;
public class IntegerPredicate implements Predicate<Product> {
    private final int price;

    public IntegerPredicate(int price) {
        this.price = price;
    }

    @Override
    public boolean test(Product product) {
        return product.getPrice() == price;
    }
}
