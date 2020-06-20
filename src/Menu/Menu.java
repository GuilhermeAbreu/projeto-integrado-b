package Menu;

import Jogadores.Personagem;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lgdfj
 */
public class Menu {
    public void EscolhasMenu() throws Exception {
        
        Personagem jogador = new Personagem();
        
        
        Scanner scanner = new Scanner(System.in);
        
        Quests quests = new Quests(jogador);
        System.out.println("Escolha entre : 1)Planeta.Terra 4-169    2)ClownPlanet  ou    3)Planeta.PlanetaImpl.AssCream ");
        System.out.print("Opção: ");
        String opcao = new java.util.Scanner(System.in).next();
        java.lang.reflect.Method method;       
        method = quests.getClass().getMethod("quest" + opcao);
        method.invoke(quests);
        System.out.println(method.toString() + "method = ");  
        
    
    }
}
