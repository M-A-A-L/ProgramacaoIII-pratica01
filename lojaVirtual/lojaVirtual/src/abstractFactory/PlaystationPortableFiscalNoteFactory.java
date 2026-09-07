package abstractFactory;

import notasFiscais.FiscalNote;
import notasFiscais.PlaystatrionPortableFiscalNote;

public class PlaystationPortableFiscalNoteFactory implements FiscalNoteFactory {
    @Override
    public FiscalNote getFiscalNote() {
        return new PlaystatrionPortableFiscalNote();
    }
}
