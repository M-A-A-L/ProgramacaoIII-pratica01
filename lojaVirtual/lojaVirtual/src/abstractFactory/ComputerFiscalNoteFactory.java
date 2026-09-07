package abstractFactory;

import notasFiscais.ComputerFiscalNote;
import notasFiscais.FiscalNote;

public class ComputerFiscalNoteFactory implements FiscalNoteFactory {
    @Override
    public FiscalNote getFiscalNote() {
      return new ComputerFiscalNote();
    };
}
