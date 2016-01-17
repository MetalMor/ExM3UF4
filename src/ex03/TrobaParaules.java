package ex03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 221015
 * @author mor
 */
public class TrobaParaules {
    
    public static void main (String[] args) throws IOException {
        
        ArrayList<String> arrayParaules = new ArrayList<>(); // clase parametrizada ArrayList (clase que contiene arrays, pero q no es un array en sí)
        
        Scanner entrada = new Scanner(System.in); // atributo que apunta a por donde metes los datos (en este claso por teclado --> System.in)
        TrobaParaules p = new TrobaParaules();
        StringTokenizer st = new StringTokenizer(llegeixTeclat("Entra cadena:")); // StringTokenizer: permite ir recorriendo las palabras de un string mas facil :D por defecto las separa por espacios
        
        while (st.hasMoreTokens()) // hasMoreToken: si hay más palabras en st, da true
            arrayParaules.add(st.nextToken()); // nextToken: saca la siguiente palabra de st y la mete con add (para consultarlo seria get, para meterlo en una posicion completa seria set, y para borrar seria remove) en arrayParaules
        
        System.out.println("La paraula es troba a la posició " + arrayParaules.indexOf(llegeixTeclat("Paraula a cercar:"))+1); // indexOf: tambien disponible para ArrayList!! C:
    
    }
        
    private static String llegeixTeclat(String miss) throws IOException {
        
        String linia = null;
        System.out.println(miss);
        Scanner entrada = new Scanner(System.in);
        
        return entrada.nextLine();
        
    }
    
    
    
}
