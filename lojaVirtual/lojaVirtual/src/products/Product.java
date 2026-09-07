package products;

import notasFiscais.FiscalNote;

public abstract class Product {
    protected String name;
    protected double price;
    protected FiscalNote fiscalNote;

    public Product() {};
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
            return name;
    }
    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price>=0) {
            this.price = price;
        }
    }
    @Override
    public String toString() {
        return "Name: '" + name +
                "'\nPrice: R$ " + price +
                "\nFiscal Note: '" + fiscalNote.emitirNota() +"'";
    }
    public abstract void setFiscalNote();
}
