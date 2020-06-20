package Jogadores;

public class Zumbi implements Inimigo{
    int vida = 20;
    int xp = 10;
    
    public void atacar(Personagem p) {
        p.vida -= 5;
    }

    public void levarDano(int quantidade) {
        this.vida -= quantidade;
    }
    
    public String toString() {
        return "Jogadores.Zumbi >> Vida: " + this.vida;
    }
    
}
