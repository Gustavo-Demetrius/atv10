/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 *
 * @author alunocmc
 */
public class Pokedex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Vaporeon v = new Vaporeon();
        Flareon f = new Flareon();
        Espeon es = new Espeon();
        Umbreon u = new Umbreon();
        Glaceon g = new Glaceon();
        Sylveon s = new Sylveon();
        
        
        System.out.println("Ataque:" + e.Ataque());
        System.out.println("Especial:" + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("--------------------------");
        
        //Aponta Pokemon
        e = j;
        System.out.println("Ataque:" + e.Ataque());
        System.out.println("Especial:" + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("--------------------------");
                
        //Aponta Pokemon
        e = v;
        System.out.println("Ataque:" + e.Ataque());
        System.out.println("Especial:" + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("--------------------------");
                
        //Aponta Pokemon
        e = f;
        System.out.println("Ataque:" + e.Ataque());
        System.out.println("Especial:" + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("--------------------------");
                
                //Aponta Pokemon
        e = es;
        System.out.println("Ataque:" + e.Ataque());
        System.out.println("Especial:" + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("--------------------------");
                
                //Aponta Pokemon
        e = u;
        System.out.println("Ataque:" + e.Ataque());
        System.out.println("Especial:" + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("--------------------------");
                
                //Aponta Pokemon
        e = g;
        System.out.println("Ataque:" + e.Ataque());
        System.out.println("Especial:" + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("--------------------------");
                
                //Aponta Pokemon
        e = s;
        System.out.println("Ataque:" + e.Ataque());
        System.out.println("Especial:" + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("--------------------------");
                
    }
    
}
