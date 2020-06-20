package Planeta.PlanetaImpl;

import Input.Input;
import Jogadores.Personagem;
import Menu.Escolhas;
import Menu.Menu;
import Planeta.Terra;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lgdfj
 */
public class Terra4169 implements Terra {
    Personagem personagem;
    Personagem jogador;
    String nome;
    Escolhas escolhas = new Escolhas();
    Scanner teclado = new Scanner(System.in);
    Menu menu = new Menu();
    
    Scanner scanner = new Scanner(System.in);
    public Terra4169(Personagem p){
        jogador = p;
    }
    public Terra4169(){
    }    
    
    public void HistoriaInicio() throws Exception{
         System.out.println("Entrando em Planeta.Terra 4-169");
        slowPrint("------------------------------------");
        System.out.println("Carregamento concluído");
        slowPrint("------------------------------------");
        System.out.println("Devido a um erro operacional, este universo \n" + "esta passando por uma apocalipse Jogadores.Zumbi");
        slowPrint("------------------------------------");
        System.out.println("Vc já esta presente no Planeta.Terra 4-169");
        slowPrint("------------------------------------");
        System.out.println("Vc está no meio de uma cidade com uma grande construção,barulhos estranhos em sua volta, o que deseja fazer?");
        System.out.println("1) Explorar 2)Revirar meus itens");
        System.out.print("Opção: ");
        int opcao = Input.deveRetorarUmInt();
        if(opcao == 1){
             System.out.println("Vc encontrou alguém na sua frente");
        slowPrint("------------------------------------");
        System.out.println("Ele está combatendo os Jogadores.Zumbi,você gostaria de: 1)Se juntar a ele 2) Entrevistar");
        
        opcao = scanner.nextInt();
        if(opcao == 1){
            Batalha();
        }else if(opcao == 2)
        {
            Historia3();
        }
        }
        else{
            ItensJogador();
        }

    }
    public void  Historia1() {
      

        
    }
    public void Batalha(){
     //combate a inimigos
        slowPrint("Escolha sua ferramenta para enfrentá-los");    
        slowPrint("1)Raiva 2)Respiração 3)Maconha");
        if(2 == Input.deveRetorarUmInt()){
            slowPrint("Parabéns! Uma das minhas frases preferidas é que saúde tem a ver com aceitar, perceber e lidar com a realidade, nos termos da realidade! Vc ganhou um item : Antídoto! Continue Jogando");
            //diminuir dano inimigo
        }
        else{
        slowPrint("Você precis de maior conhecimento, talvez você não consiga continuar");
            //aumentar dano do inimigo
        }

        System.out.println(" 2 criaturas estão cercando o local e uma delas está vindo em sua direção");
        System.out.println("Território é um pouco ìngreme, você está em um ponto mais alto ");
        System.out.println("Criatura está agora na sua frente, o que deseja fazer?" + "1)Atacar 2)Revirar meus itens");

    }
    public void Historia2() {
        
    }
    
    public void Historia3() throws Exception{
       //entrevista
        System.out.println("O que vc gostaria de perguntar primeiro? 1)Nome 2)O que ele faz aqui");
        int opcao = scanner.nextInt();
        //System.out.println((opcao ==1)? "Ola" : "teste");
        
        if(opcao == 1){ //1) Nome
            System.out.println("Olá, eu me chamo Glasses Man, sou o presidente! \n  Caramba!! GLASSES MAN não ");
            System.out.println("Você deseja voltar para o menu e selecionar outro planeta? 1)Sim 2)Não");
            opcao = scanner.nextInt();
            if(opcao ==1 ){
                menu.EscolhasMenu();
            }
            else{ 
                slowPrint("É"); //Nao
                slowPrint( "Jogador: "+ " Sei que parece muito ocupado com esse apocalipse Jogadores.Zumbi comendo solto, mas vc se importa se eu gravar essa conversa? ");
                slowPrint("Glasses Man: De forma alguma, diga meu jovem");
                slowPrint("Jogador:: " + " ÓTIMO!\n" + "Acho que...Primeiro, quero te agradecer! E fale mais sobre sua visão sistêmica?");
                slowPrint("Glasses Man: Sou a favor da liberdade humana, de deixar o povo determinar as leis. Não acho que... Se eu tivesse que... Sabe, se alguém me pressionasse a dizer se vai ser bom ou ruim... Acho que pode acabar não sendo tão bom pras pessoas. ");
                slowPrint("Jogador:: "+ " OPAa! Estamos sendo atacados pelos zumbis...***gravação interrompida*** ");
                Batalha();
            }
        }else{ //2) O que ele faz aqui
        System.out.println("Estou combatendo os Zumbis para proteger a população! Vamos ter que iniciar o protocolo Alfa! Quer se juntar a mim? 1)Sim 2) Não ");
            if(opcao == 1){
                Batalha(); //Sim
            }
            else{
                slowPrint("É"); //Nao
                slowPrint("Jogador: "+ " Sei que parece muito ocupado com esse apocalipse Jogadores.Zumbi comendo solto, mas vc se importa se eu gravar essa conversa? ");
                slowPrint("Glasses Man: De forma alguma, diga meu jovem");
                slowPrint("Jogador: " + " ÓTIMO!\n" + "Acho que...Primeiro, quero te agradecer! E fale mais sobre sua visão sistêmica?");
                slowPrint("Glasses Man: Sou a favor da liberdade humana, de deixar o povo determinar as leis. Não acho que... Se eu tivesse que... Sabe, se alguém me pressionasse a dizer se vai ser bom ou ruim... Acho que pode acabar não sendo tão bom pras pessoas. ");
                slowPrint("Jogador: "+ " OPAa! Estamos sendo atacados pelos zumbis...***gravação interrompida*** ");
                Batalha();
        }
        }
        //nome
        
    }
    public void Historia4() {
        
        
    }
     public static void slowPrint(String mensagem) {
        char[] chars = mensagem.toCharArray();
        // Print a char from the array, then sleep for 1/10 second
        for (int i = 0; i < chars.length; i++) 
        {
            System.out.print(chars[i]);
            try{
            Thread.sleep(30);
        }
            catch(InterruptedException e){
            e.printStackTrace();
        }
        }
        System.out.println(" ");
     }
      public int EscolhaFalas(int opcao,String fala1,String fala2){
        
            switch(opcao){
            case 1:
                System.out.println(fala1);
                break;
            case 2:
                System.out.println(fala2);
                break;
            default:
                System.out.println("opção inválida");
                break;
                }
        return 0;
        }
       public void ItensJogador() {
        //jogador.itens();
        System.out.println("Não tem nada na minha mochila! Continue Jogando! ");
        System.out.println("1) Explorar 2)Revirar itens");
        try {
            escolhas.EscolhasJogador(Input.deveRetorarUmInt(),"Historia1","ItensJogador");
        } catch (Exception ex) {
            Logger.getLogger(TerraClownPlanet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //System.out.println(personagem.getNome()+ ": "+ );
    }
 
 
    
   
   
   
    
    
    
}
