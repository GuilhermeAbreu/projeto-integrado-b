/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lgdfj
 */
public class Escolhas {
    public int EscolhasJogador(String opcao,String metodo1,String metodo2) throws Exception 
    {
        TerraClownPlanet terraClownPlanet = new TerraClownPlanet();
        java.lang.reflect.Method method;    
        do{
            switch(opcao){
            case "1":
                method = terraClownPlanet.getClass().getMethod(metodo1);
                method.invoke(terraClownPlanet);
                break;
            case "2":
                method = terraClownPlanet.getClass().getMethod(metodo2);
                method.invoke(terraClownPlanet);
                break;
            case "0":
                break;
            default:
                System.out.println("opção inválida");
                break;
                }
        }while (opcao != "0" );
        return 0;
        
        
        
        //System.out.println("Escolha entre 2)floresta   2)entrevista");
        //System.out.print("Opção: ");
        
        //TerraClownPlanet terraClownPlanet = new TerraClownPlanet();
       // java.lang.reflect.Method method; 
           
       // method = terraClownPlanet.getClass().getMethod("Historia" + opcao);
        //method.invoke(terraClownPlanet);
        
        
        
        //return 0;
    
    }
    
}
