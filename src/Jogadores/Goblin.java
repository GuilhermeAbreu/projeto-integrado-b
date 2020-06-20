package Jogadores;

public class Goblin implements Inimigo{
    //comentario
    int vida = 15;
    int xp = 5;
    
    public void atacar(Personagem p) {
        p.vida -= 2;
    }

    public void levarDano(int quantidade) {
        this.vida -= quantidade;
    }
    
    public String toString() {
        return "Jogadores.Goblin >> Vida: " + this.vida;
    }
    
}
