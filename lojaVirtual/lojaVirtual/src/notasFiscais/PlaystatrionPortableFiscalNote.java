package notasFiscais;

public class PlaystatrionPortableFiscalNote implements FiscalNote{
    @Override
    public String emitirNota() {
        return "Nota do PSP";
    }
}
