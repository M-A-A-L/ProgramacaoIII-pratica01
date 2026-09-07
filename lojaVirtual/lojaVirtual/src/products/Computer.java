package products;

import abstractFactory.FiscalNoteFactory;

public class Computer extends Product{
     private FiscalNoteFactory fiscalNoteFactory;
     public Computer(FiscalNoteFactory fiscalNoteFactory) {
          this.fiscalNoteFactory = fiscalNoteFactory;
     }
     @Override
     public void setFiscalNote() {
          fiscalNote = fiscalNoteFactory.getFiscalNote();
     }
}
