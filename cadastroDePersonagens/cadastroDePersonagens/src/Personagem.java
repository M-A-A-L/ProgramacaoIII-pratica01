public class Personagem implements Cloneable{
    private String nome;
    private int vida;
    private double mana;
    private double forca;
    private double defesa;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public double getMana() {
        return mana;
    }
    public void setMana(double mana) {
        this.mana = mana;
    }
    public double getForca() {
        return forca;
    }
    public void setForca(double forca) {
        this.forca = forca;
    }
    public double getDefesa() {
        return defesa;
    }
    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }
    @Override
    public Personagem clone() throws CloneNotSupportedException{
        return (Personagem) super.clone();
    }
    public void imprimirPersonagem(String personagem) {
        System.out.println("==== "+personagem+" ====");
        System.out.println("Nome: "+nome);
        System.out.println("Vida: "+vida);
        System.out.println("Mana: "+mana);
        System.out.println("Força: "+forca);
        System.out.println("Defesa: "+defesa);
    }
}
