package notasFiscais;

public class NotebookFiscalNote implements FiscalNote{
    @Override
    public String emitirNota() {
        return "Nota fiscal do notebook";
    }
}