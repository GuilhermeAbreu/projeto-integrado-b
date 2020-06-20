package Menu;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Planeta.PlanetaImpl.TerraClownPlanet;

/**
 *
 * @author lgdfj
 */
public class Escolhas {
    public int EscolhasJogador(int opcao,String metodo1,String metodo2) throws Exception
    {
        TerraClownPlanet terraClownPlanet = new TerraClownPlanet();
        java.lang.reflect.Method method;    
        do{
            if (1==opcao) {
                method = terraClownPlanet.getClass().getMethod(metodo1);
                method.invoke(terraClownPlanet);
            } else if (2 == opcao) {
                method = terraClownPlanet.getClass().getMethod(metodo2);
                method.invoke(terraClownPlanet);
            } else if (0==opcao) {
            } else {
                System.err.println("opção inválida");
            }
        }while (opcao != 0 );
        return 0;
        
        
        
        //System.out.println("Escolha entre 2)floresta   2)entrevista");
        //System.out.print("Opção: ");
        
        //Planeta.PlanetaImpl.TerraClownPlanet terraClownPlanet = new Planeta.PlanetaImpl.TerraClownPlanet();
       // java.lang.reflect.Method method; 
           
       // method = terraClownPlanet.getClass().getMethod("Historia" + opcao);
        //method.invoke(terraClownPlanet);
        
        
        
        //return 0;
    
    }
    
}
