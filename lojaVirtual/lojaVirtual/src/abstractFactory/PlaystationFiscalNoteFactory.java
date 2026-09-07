package abstractFactory;

import notasFiscais.FiscalNote;
import notasFiscais.PlaystationFiscalNote;

public class PlaystationFiscalNoteFactory implements FiscalNoteFactory{
    @Override
    public FiscalNote getFiscalNote() {
        return new PlaystationFiscalNote();
    }
}
