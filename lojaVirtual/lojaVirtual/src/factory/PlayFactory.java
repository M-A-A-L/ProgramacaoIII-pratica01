package factory;

import abstractFactory.FiscalNoteFactory;
import abstractFactory.PlaystationFiscalNoteFactory;
import abstractFactory.PlaystationPortableFiscalNoteFactory;
import products.*;

public class
PlayFactory extends ProductFactory{
    @Override
    protected Product createProduct(String type) {
        Product product;
        FiscalNoteFactory fiscalNoteFactory;
        if (type.equals("Playstation")) {
            fiscalNoteFactory = new PlaystationFiscalNoteFactory();
            product = new Playstation(fiscalNoteFactory);
        } else if (type.equals("PlaystationPortable")) {
            fiscalNoteFactory = new PlaystationPortableFiscalNoteFactory();
            product = new PlaystationPortable(fiscalNoteFactory);
        } else {
            product = null;
        }
        return product;
    }
}
