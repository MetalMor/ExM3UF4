/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombreaparicions;

import java.util.Scanner;

/**
 *
 * @author mor
 */
public class NombreAparicionsLletra {
    

    
    public static void main (String[] args) {
        
        int[] lletres = new int[26];
        Scanner entrada = new Scanner(System.in); // atributo que apunta a por donde metes los datos (en este claso por teclado --> System.in)
	
        System.out.println("Entra una paraula:");
        String paraula = entrada.nextLine().toUpperCase();
        
        for (int i = 0 ; i < paraula.length() ; i++) {
            lletres[paraula.charAt(i)-65]++;
            
            }
        char lletra = 65;
        
        for (int i = 0 ; i<26 ; i++) {
            
            System.out.println((lletra++) + ": " + lletres[i] + "\t");
            
        }
        
    }
    
}
