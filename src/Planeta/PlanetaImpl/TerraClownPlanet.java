package Planeta.PlanetaImpl;

import Input.Input;
import Jogadores.Personagem;
import Menu.Escolhas;
import Menu.Menu;
import Planeta.Terra;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TerraClownPlanet implements Terra {
    Personagem jogador;
    String nome;
    Escolhas escolhas = new Escolhas();
    Menu menu = new Menu();
    public TerraClownPlanet(Personagem p){
        jogador = p;
    }
    public TerraClownPlanet(){
    }    
    
    public void HistoriaInicio(){
        System.out.println("Entrando em ClownPlanet");
        slowPrint("------------------------------------");
        System.out.println("Iniciando simulação em 3,2,1... Carregamento concluido!");
        slowPrint("------------------------------------");
        System.out.println("Vc já esta presente no ClownPlanet \n Dica do magistrado cestinha, cuidado ao baixar pacotes de emojis não verificados. Muitos contém paródias, hacks e vírus. ");
        slowPrint("------------------------------------");
        System.out.println("Vc está em uma floresta povoada por palhacinhos, parece divertido, o que deseja fazer?");
        System.out.println("1)Explorar 2)Revirar meus itens");

        try {
            escolhas.EscolhasJogador(Input.deveRetorarUmInt(),"Historia1","ItensJogador");
        } catch (Exception ex) {
            Logger.getLogger(TerraClownPlanet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    public void Historia1() {
        System.out.println("Vc se aproxima e vê...");
        slowPrint("jogador: " + "Caramba!! Que diabos é isso?");
        System.out.println("Vc vê diante de sua frente um híbrido cachorro com chifre de veado");
        System.out.println("1)Batalha 2)Entrevistar");
        
        try {
            EscolhasJogador(Input.deveRetorarUmInt(),"Batalha","Entrevistar");
        } catch (Exception ex) {
            Logger.getLogger(TerraClownPlanet.class.getName()).log(Level.SEVERE, null, ex);
        } 

      //escolher Batalha metodo batalha entra
      // palhacinho tem 5 de ataque e ataca, 5 de life
      // jogador tem 10 de life e 5 de ataque 
      // jogador escolhe a ferramenta pra usar 1) ANSIEDADE, 2) SOFRIMENTO 3)AMOR
      // jogador vence se ele escolher AMOR e ai ele morre e imprime a mensagem : é preciso haver morte pra ajudar a superar! A morte é um paraíso. Vc ganhou um item : Suco de maça

     // escolher Entrevistar

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

    public void Batalha() throws Exception{
        slowPrint("Escolha sua ferramenta para enfrentá-los");    
        slowPrint("1) Ansiedade 2)Sofrimento 3)Amor");
        if(Input.deveRetorarUmInt() == 3){
            slowPrint("Parabéns, você escolheu sabiante, você deve derrotar o inimigo com facilidade");
            //diminuir dano inimigo
        }
        else{
        slowPrint("Você precis de maior conhecimento, talvez você não consiga continuar");
            //aumentar dano do inimigo
        }

        System.out.println(" 2 criaturas estão cercando o local e uma delas está vindo em sua direção");
        System.out.println("Território é um pouco ìngreme, você está em um ponto mais alto ");
        System.out.println("Criatura está agora na sua frente, o que deseja fazer?" + "1)Atacar 2)Revirar meus itens");
        /*
        String opcao = teclado.next();
        try {
            escolhas.EscolhasJogador(opcao,"Atacar","ItensJogador ");
        } catch (Exception ex) {
            Logger.getLogger(Planeta.PlanetaImpl.TerraClownPlanet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        */
   
        
    }
    public void limpar(){
    System.out.println("\n\n\n");
    
    }
    public void teste(){
    //comentario
    //linha 2
    }
    
    public void Entrevistar() throws Exception{
        
        limpar();
        System.out.println("Jogador: Boa noite, Sr...? " );
        slowPrint("Anne: Pode me chamar de Anne, com 2 ''N''");
        System.out.println("Jogador: "+"Se importa se eu entrevistar vc pra um vídeo no meu espaçocast? ");
        slowPrint("Anne: Pode ser, estou animada! Sempre quis fazer um espaçocast! ");
        System.out.println("Jogador: "+" Seja bem vinda! 1)O que faz nessa floresta?  2)Que tipo de criatura vc é? ");
        int opcao = Input.deveRetorarUmInt(); //
        EscolhaFalas(opcao
                ,"Eu vivo aqui, aqui é minha casa, temos uma comunidade aqui perto cheio de seres inteligentes com historia pra contar. \n" + "Vc quer que eu te conte algumas histórias? \n" + "1)Sim 2)Não" 
                ,"Anne: Sou um híbrido cachorro nobre e pacífico! \n" + "Todos aqui são assim?\n" + "A grande maioria, existem apenas outros seres como os palhacinhos, eles não são muito amigáveis, mas são apetitosos...Vc gostaria de caçar alguns comigo? \n 1)Sim 2)Não");
        if(opcao == 1 ){ //1)O que faz nessa floresta?
            opcao = Input.deveRetorarUmInt();
            EscolhaFalas(opcao
                        ,"Sim, porfavor, me conte \n" +" Tem uma historia de uma menininha que morre de medo de dormir no escuro, e ela fica chamando a mae dela. a mae vem e diz jesus esta aqui com vc. \n Não tenha medo. E a criança diz ''Preciso de alguém com pele.''\n  E então enquanto ela não tiver alguém com pele e sentir medo, ela morre! Inclusive, vc gostaria de enfrentar seu medo comigo? 1)Sim 2)Não "
                        ," Fica para uma próxima");
                        if(opcao == 1){
                            opcao = Input.deveRetorarUmInt();
                            EscolhaFalas(opcao
                                            ,"Isso que vc falou de reconhecer a morte, é uma parte inevitável. É libertador aceitar. "
                                            ,"Vamos continuar,Que tipo de criatura você é? \n " + "Annie: Sou um híbrido cachorro nobre e pacífico! \n" + "Todos aqui são assim?\n" + "A guande maioria, existem apenas outros seres como os palhacinhos, eles não são muito amigáveis, mas são apetitosos...Vc gostaria de caçar alguns comigo? \n " + "1) Sim 2) Não");                      
                                            if(opcao == 1){
                                            Batalha();
                                            }else if(opcao ==2){
                                                System.out.println("O que nos anima e nos cura não vem de frases de para-choque. É preciso batalhar pra conseguir!");
                                                System.out.println(" Acho que não temos escolha, eles estão VINDO EM NOSSA DIREÇÃOOO!!!");
                                                
                                                Batalha();
                                            }
                        }
                        else if(opcao ==2){
                            System.out.println("Acho que tem algo vindo em nossa direção, SÃO OS PALHACINHOSS!!!");
                            Batalha();
                        }
        }
        else if(opcao == 2){ //2)Que tipo de criatura vc é?
            opcao = Input.deveRetorarUmInt();
            EscolhaFalas(opcao
                    ,"Sim, vamos nessa!!! \n"
                    ,"Que pena...");
                    if(opcao == 1){
                        Batalha();
                        }else if(opcao ==2){
                            System.out.println(" Não, muito obrigado! Isso é tao lindo, e eu odeio estragar este momento, mas vou ser sincero, tenho que ir ao banheiro ");
                            slowPrint("------------------------------");
                            System.out.println("Saindo do planeta e voltando a nave");
                            slowPrint("------------------------------");
                            slowPrint("------------------------------");
                            slowPrint("------------------------------");
                            menu.EscolhasMenu(); 
                        }
        }
    }

    
    
    public static void slowPrint(String mensagem) {
        char[] chars = mensagem.toCharArray();
        // Print a char from the array, then sleep for 1/10 second
        for (int i = 0; i < chars.length; i++) 
        {
            System.out.print(chars[i]);
            try{
            Thread.sleep(60);
        }
            catch(InterruptedException e){
            e.printStackTrace();
        }
        }
        System.out.println(" ");
        
        
        
        /*
    for (int i = 0;i < mensagem.length(); i++){
        System.out.print(mensagem.charAt(i));
        try{
            Thread.sleep(30);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        */
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
        
        

    
    public int EscolhasJogador(int opcao,String metodo1,String metodo2) throws Exception
    {
        TerraClownPlanet terraClownPlanet = new TerraClownPlanet();
        String resposta;
        //System.out.println("Escolha entre 2)floresta   2)entrevista");
        //System.out.print("Opção: ");
        if(opcao ==  1){
            resposta = metodo1;
            System.out.println("executa metodo 1");
        }
        else{
            resposta = metodo2;
            System.out.println("executa metodo 2");
        }

        
        java.lang.reflect.Method method;       
        method = terraClownPlanet.getClass().getMethod(resposta);
        method.invoke(terraClownPlanet);
        return 0;
    
    }
    /*
     public int Menu.Escolhas(int opcao,String metodo,String metodo2) throws NoSuchMethodException{
        
        do{
            java.lang.reflect.Method method;      
            
            switch(opcao){
                case 1:
                        method = terraClownPlanet.getClass().getMethod(metodo);
                        System.out.println("escolhi metodo 1");
                        
                        
                    break;
                case 2:
                        method = terraClownPlanet.getClass().getMethod(metodo2);
                        System.out.println("escolhi metodo 1");
                    break;
                case 0:
                        break;
                default:
                    System.out.println("opção inválida");
                    
                    break;
            }
        }while (opcao != 0 || opcao != 1 || opcao != 2);
        return 0;
    }
        */
            /*
     Menu.Quests quests = new Menu.Quests();
        System.out.println("Escolha entre 1)Planeta.Terra 4-169 1   2)Universo 2  ou  3)Universo 3 ");
        System.out.print("Opção: ");
        String opcao = new java.util.Scanner(System.in).next();
        java.lang.reflect.Method method;       
        method = quests.getClass().getMethod("quest" + opcao);
        method.invoke(quests);
    */ 

    
    public void Historia2() {
        
    }
}
