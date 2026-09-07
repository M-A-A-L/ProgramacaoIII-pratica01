public class Client{
    public static void main(String[] args) throws CloneNotSupportedException {
        Personagem guerreiro = new Personagem();
        guerreiro.setNome("Guerreiro");
        guerreiro.setVida(100);
        guerreiro.setMana(50);
        guerreiro.setForca(80);
        guerreiro.setDefesa(90);
        Personagem guerreiro2 = guerreiro.clone();
        Personagem guerreiro3 = guerreiro.clone();
        Personagem guerreiro4 = guerreiro.clone();
        guerreiro2.setVida(70);
        guerreiro3.setDefesa(25);
        guerreiro4.setMana(100);
        guerreiro.imprimirPersonagem("Guerreiro Original");
        guerreiro2.imprimirPersonagem("Guerreiro 2");
        guerreiro3.imprimirPersonagem("Guerreiro 3");
        guerreiro4.imprimirPersonagem("Guerreiro 4");
    }
}
