/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.Random;

/**
 *
 * @author Guilherme Abreu
 */
public class ArenaBatalha {

    public ArenaBatalha(List<Personagem> personagem){

    if(personagem.size() <= 2) batalhar(personagem);

}

    public void batalhar(List<Personagem> personagem){

        int personagemOrdem = 0;

        TerraClownPlanet.slowPrint("Iniciando mais uma batalha . . .");

        while(personagem.get(0).getDanoJogador() > 0 && personagem.get(1).getDanoJogador() > 0){

            Personagem p;

            if(personagemOrdem == 0){
                p = personagem.get(1);
            }else {
                p = personagem.get(0);
            }

            if(!personagem.get(personagemOrdem).isNpc()){
                System.out.println("atual: " + personagem.get(personagemOrdem).getDanoJogador());
                System.out.println(personagem.get(personagemOrdem).getNome() + " sua vez" +
                        "\n 1) Atacar" +
                        "\n 2) Ver intens" +
                        "\n 3) Fugir" +
                        "\n 4) Pula a vez" +
                        "\n \n Digite uma opção");
                optionsDoUsuario(Input.deveRetorarUmInt(),p);
            }else {
                System.out.println(personagem.get(personagemOrdem).getNome() + "está atacando");
                        optionsDoUsuario(1, p);
            }
           if(personagemOrdem == 0){
               personagemOrdem++;
           }
           else if(personagemOrdem == 1){
               personagemOrdem--;
           }

        }

        if(personagem.get(0).getDanoJogador() <= 0 ){
            System.out.println(personagem.get(0).getNome() + "E o vencedor");
        }else{
            System.out.println(personagem.get(1).getNome() + "E o vencedor");
        }

    }

    public void optionsDoUsuario(int optin, Personagem personagem){
        boolean isValido = true;
        while (isValido){
            if(optin == 1){
                Random random = new Random();
                int dano = random.nextInt(20);
                if(dano == 0) System.out.println("Não houve dano");
                personagem.setDanoJogador(dano);
                isValido = false;
            }else if(optin == 2){
                System.out.println("Ver lista");
                isValido = false;
            }else if(optin == 3){
                System.out.println("fugir");
                isValido = false;
            }else if(optin == 4){
                System.out.println("pular a vez");
                isValido = false;
            }else {
                System.err.println("Opção invalido");
            }
        }

    }

}
