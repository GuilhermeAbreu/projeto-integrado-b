package Jogadores;

import java.util.ArrayList;
import java.util.Scanner;

public class Personagem  {
    //Atributos
    static String nome;
    public boolean npc;
    int vida;
    int nivel;
    int xp;
    
    private void pri(){
        System.out.println("privado?");
    }

    public static String getNome() {
        return nome;
    }
    
    //Métodos
    //Construtor - invocado quando um objeto da classe é criado
    public Personagem() {
        nome = "SemNome";
        vida = 100;
        nivel = 1;
        xp = 0;
        npc = true;
    }
    
    public Personagem(String nome) {
        this.nome = nome; //ATRIBUTO nome (this) recebe o valor do ARGUMENTO nome
        vida = 100;
        nivel = 1;
        xp = 0;
        npc = false;
    }

    public boolean isNpc() {
        return npc;
    }

    public String status() {
        String status = "";
        
        status += "Nome: " + this.nome + "\n";
        status += "Nível: " + this.nivel + "\n";
        status += "XP: " + this.xp + "\n";
        status += "Vida: " + this.vida;
        
        return status;
    }
    public String itens()
    {
        String itens = "";
        System.out.println("Revirando itens....");
        System.out.println("Não possuo nenhum item");
        return itens;
    }

    public int getDanoJogador() {
        return vida;
    }

    public void setDanoJogador(int danoJogador) {
        this.vida -= danoJogador;
    }
}
