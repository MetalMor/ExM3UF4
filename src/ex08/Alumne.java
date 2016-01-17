package ex08;

import java.util.Scanner;

/**
 * 
 * 161015
 * @author mor
 */
public class Alumne {
    
    private String nom;
    private Nota nota;
    
    public Alumne() {
        
        Scanner entrada = new Scanner(System.in); // atributo que apunta a por donde metes los datos (en este claso por teclado --> System.in)
        
        System.out.println("Introdueix el nom: ");
        setNom(entrada.nextLine());
        
        System.out.println("Introdueix la nota: ");
        setNota(entrada.nextLine());
        
    }
    
    public void setNota(String n) {
        n = n.toUpperCase(); // pone la variable n a mayusculas (no confundir con Character.toUpperCase(n) que es para char)
        switch (n) {
            case "I":
                nota = Nota.INSUFICIENT;
                System.out.println("Has d'estudiar més!");
                break;
            case "S":
                nota = Nota.SUFICIENT;
                break;
            case "B":
                nota = Nota.BE;
                break;
            case "N":
                nota = Nota.NOTABLE;
                break;
            case "E":
                nota = Nota.EXCELENT;
                break;
            default:
                System.out.println("Això no és una nota");
        }
    }
    
    public String getNota() {
        return nota.getDescription();
    }
    
    public void setNom(String n) {
        nom = n;
    }
    
    public String getNom() {
        return nom;
    }
    
}
