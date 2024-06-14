package JavaforQA.HW07;
public class StringPredicate implements Predicate<Product> {
    private final String name;

    public StringPredicate(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Product product) {
        return product.getName().equalsIgnoreCase(name);
    }
}
