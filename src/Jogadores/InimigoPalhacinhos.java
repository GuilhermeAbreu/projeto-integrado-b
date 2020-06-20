package Jogadores;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lgdfj
 */
public class InimigoPalhacinhos implements Inimigo{

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
