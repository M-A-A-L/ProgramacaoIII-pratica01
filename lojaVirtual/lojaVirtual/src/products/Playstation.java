package products;

import abstractFactory.FiscalNoteFactory;

public class Playstation extends Product{
    private FiscalNoteFactory fiscalNoteFactory;
    public Playstation (FiscalNoteFactory fiscalNoteFactory) {
        this.fiscalNoteFactory = fiscalNoteFactory;
    }
    @Override
    public void setFiscalNote() {
        fiscalNote = fiscalNoteFactory.getFiscalNote();
    }
}
