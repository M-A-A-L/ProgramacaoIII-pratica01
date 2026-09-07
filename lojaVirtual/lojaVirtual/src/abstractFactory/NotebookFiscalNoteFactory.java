package abstractFactory;

import notasFiscais.FiscalNote;
import notasFiscais.NotebookFiscalNote;

public class NotebookFiscalNoteFactory implements FiscalNoteFactory{
    @Override
    public FiscalNote getFiscalNote() {
        return new NotebookFiscalNote();
    }
}
