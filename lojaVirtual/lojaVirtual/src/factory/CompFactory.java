package factory;

import abstractFactory.ComputerFiscalNoteFactory;
import abstractFactory.FiscalNoteFactory;
import abstractFactory.NotebookFiscalNoteFactory;
import products.Computer;
import products.Notebook;
import products.Product;

public class CompFactory extends ProductFactory{
    @Override
    protected Product createProduct(String type) {
        Product product;
        FiscalNoteFactory fiscalNoteFactory;
        if (type.equals("Computer")) {
            fiscalNoteFactory = new ComputerFiscalNoteFactory();
            product = new Computer(fiscalNoteFactory);
        } else if (type.equals("Notebook")) {
            fiscalNoteFactory = new NotebookFiscalNoteFactory();
            product = new Notebook(fiscalNoteFactory);
        } else {
            product = null;
        }
        return product;
    }
}
