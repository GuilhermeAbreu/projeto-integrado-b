
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
public class Terra4169 implements Terra{
    Personagem personagem;
    
    
    @Override
    public void  Historia1() {
        System.out.println("Entrando em Terra 4-169");
        System.out.println("------------------------------------");
        System.out.println("Carregamento concluído");
        System.out.println("------------------------------------");
        System.out.println("Devido a um erro operacional, este universo \n" + "esta passando por uma apocalipse Zumbi");
        System.out.println("------------------------------------");
        System.out.println("Vc já esta presente no Terra 4-169");
        System.out.println("------------------------------------");
        System.out.println("Vc está no meio de uma cidade com uma grande construção,barulhos estranhos em sua volta, o que deseja fazer?");
        System.out.println("1) Explorar 2)Revirar meus itens");
        System.out.print("Opção: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        
    }
    @Override
    public void Historia2() {
        System.out.println("Vc encontrou alguém na sua frente");
        System.out.println("------------------------------------");
        System.out.println("Ele está combatendo os Zumbi,você gostaria de: 1)Se juntar a ele 2) Entrevistar");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num == 1){
            Historia3();
        }else if(num == 2)
        {
            Historia4();
        }
    }
    
    public void Historia3() {
        //combate a inimigos
        System.out.println("");
    }
    public void Historia4() {
        //entrevista
        System.out.println("O que vc gostaria de perguntar primeiro? 1)Nome 2)O que ele faz aqui");
        //nome
        System.out.println("Glasses Man: Olá, eu me chamo Glasses Man, sou o presidente!");
        System.out.println(personagem.getNome()+ ": "+ " Caramba!! GLASSES MAN não :|");
        
        System.out.println(personagem.getNome()+ ": "+ " Sei que parece muito ocupado com esse apocalipse zumbi comendo solto, mas vc se importa se eu gravar essa conversa? ");
        System.out.println("Glasses Man: De forma alguma, diga meu jovem");
        System.out.println(personagem.getNome() + ": " + " ÓTIMO!\n" + "Acho que...Primeiro, quero te agradecer! E fale mais sobre sua visão sistêmica?");
        System.out.println("Glasses Man: Sou a favor da liberdade humana, de deixar o povo determinar as leis. Não acho que... Se eu tivesse que... Sabe, se alguém me pressionasse a dizer se vai ser bom ou ruim... Acho que pode acabar não sendo tão bom pras pessoas. ");
        System.out.println(personagem.getNome()+ ": "+ " OPAa! Estamos sendo atacados pelos zumbis...***gravação interrompida*** ");
        //faz um ataque (chama Historia 3)
        //depois faz mais algumas perguntas e volta para o menu
        
    }
 
 
    
   
   
   
    
    
    
}
