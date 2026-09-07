public class Configuracao {
    private static Configuracao instancia;
    private String idioma;
    private String tema;
    private Configuracao() {}
    private Configuracao(String idioma, String tema) {
        this.idioma = idioma;
        this.tema = tema;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
    return instancia;
     }
}
