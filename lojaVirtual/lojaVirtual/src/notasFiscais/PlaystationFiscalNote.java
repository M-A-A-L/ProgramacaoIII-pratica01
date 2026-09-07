package notasFiscais;

public class PlaystationFiscalNote implements FiscalNote{
    @Override
    public String emitirNota() {
        return "Nota fiscal do playstation";
    }
}
