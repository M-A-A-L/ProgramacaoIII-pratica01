package notasFiscais;

public class ComputerFiscalNote implements FiscalNote{
    @Override
    public String emitirNota() {
        return "Nota fiscal do computador";
    }
}
