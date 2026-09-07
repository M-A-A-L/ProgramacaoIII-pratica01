package products;

import abstractFactory.FiscalNoteFactory;

public class PlaystationPortable extends Product{
    private FiscalNoteFactory fiscalNoteFactory;
    public PlaystationPortable(FiscalNoteFactory fiscalNoteFactory) {
        this.fiscalNoteFactory = fiscalNoteFactory;
    }
    @Override
    public void setFiscalNote() {
        fiscalNote = fiscalNoteFactory.getFiscalNote();
    }
}
