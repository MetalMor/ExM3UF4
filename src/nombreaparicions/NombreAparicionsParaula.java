/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombreaparicions;

/**
 *
 * @author mor
 */
public class NombreAparicionsParaula {

    /**
     * @param args the command line arguments
     */
    private static String frase = "Cargol treu banya puja a la muntanya cargol treu vi puja al muntanyi";
    private static String paraulaClau = "cargol";
    private static String[] arrayParaules = frase.split(" ");
    
    public static void main(String[] args) {
        
        int i = 0; //contador de palabras
        
        System.out.println(frase);
		
        for (String paraula:arrayParaules) {
			
            if (paraula.equalsIgnoreCase(paraulaClau)) i++;
			
	}
		
	System.out.println("La paraula \"" + paraulaClau + "\" es repeteix " + i + " vegades a la frase \"".concat(frase) + "\".");
		
    }
}
