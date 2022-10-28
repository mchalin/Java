/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Maxi
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona2 = new Persona("Max", 13000, true);
        
        System.out.println(persona2.getNombre());
        persona2.setNombre("Vale");
        System.out.println(persona2.getNombre());
        
    }
}
