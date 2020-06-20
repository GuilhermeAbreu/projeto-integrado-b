import Jogadores.Goblin;
import Jogadores.Personagem;
import Jogadores.Zumbi;
import Menu.Menu;

import java.util.Scanner;
public class JogoV7 {
    public static void main(String[] args) throws Exception  {
        
        
        Scanner scanner = new Scanner(System.in);
        
        Goblin g1 = new Goblin();
        Zumbi g2 = new Zumbi();
        Menu menu = new Menu();

        
        System.out.println("Digite o nome do seu personagem: ");
        String nome = scanner.next();
        Personagem jogador = new Personagem(nome);
        
        //Criando um personagem guerreiro:
        
        System.out.println("Seja bem vindo: " + jogador.getNome());
        
        System.out.println("Você acaba de comprar um simulador, qual Planeta você deseja jogar primeiro? ");
        menu.EscolhasMenu();
        
        
        

    
        
        
        /*
          public Method getMethod(String name, Class<?>... parameterTypes)
        throws NoSuchMethodException, SecurityException {
        checkMemberAccess(Member.PUBLIC, Reflection.getCallerClass(), true);
        Method method = getMethod0(name, parameterTypes, true);
        if (method == null) {
            throw new NoSuchMethodException(getName() + "." + name + argumentTypesToString(parameterTypes));
        }
        return method;
    }
        /*
        
        
        
        
        */
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        //System.out.println(jogador.status());
        /*
        System.out.println(g1);
        
        System.out.println("--------------------------------------");
        System.out.println("vez do goblin, globin ataca");
        g1.atacar(jogador);
        System.out.println("vocÊ perdeu: " + jogador.status());
        System.out.println(jogador.status());
        System.out.println(g1);
        System.out.println("---------------------------------------------");
        g1.levarDano(jogador.danoJogador);
        g1.atacar(jogador);
        System.out.println(jogador.status());
        System.out.println(g1);
        */
        
    }
}
