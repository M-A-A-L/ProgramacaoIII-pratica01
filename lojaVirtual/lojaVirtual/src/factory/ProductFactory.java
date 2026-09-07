package factory;

import products.Product;

public abstract class ProductFactory {
    protected abstract Product createProduct(String type);

    public Product orderProduct(String type, String name, double price) {
        Product product = createProduct(type);
        if (product == null) {
            return null;
        }
        product.setName(name);
        product.setPrice(price);
        product.setFiscalNote();
        System.out.println(product.toString());
        return product;
    }
}
