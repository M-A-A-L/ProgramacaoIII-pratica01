package products;

import abstractFactory.FiscalNoteFactory;

public class Notebook extends Product{
    private FiscalNoteFactory fiscalNoteFactory;
    public Notebook(FiscalNoteFactory fiscalNoteFactory) {
        this.fiscalNoteFactory = fiscalNoteFactory;
    }
    @Override
    public void setFiscalNote() {
        fiscalNote = fiscalNoteFactory.getFiscalNote();
    }
}
