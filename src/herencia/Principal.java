package herencia;

import java.util.*;
import java.util.logging.Logger;

/**
 * 081015
 * @author mor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleat empleat1 = new Manager(); //se pueden declarar objetos Manager de la clase Empleat, ya que Manager hereda de Empleat
        Empleat empleat2 = new Empleat("Joel",500);
        Manager manager1 = new Manager("Mor",2000,"Inf",500);
        
        ((Manager)empleat1).setNom("Pepito"); //DOWNCASTING para acceder a los metodos de Manager, ya que empleat1 es un Manager declarado como Empleat
        
        
        System.out.println(empleat1.getNom()+" - "+empleat1.getSal());
        System.out.println(empleat2.getNom()+" - "+empleat2.getSal());
        System.out.println(empleat1);
        System.out.println(empleat2);
        System.out.println(manager1);
        
        System.out.println("\n");
        
        ArrayList<Empleat> llistaEmpleats = new ArrayList<>();
        
        llistaEmpleats.add(empleat1);
        llistaEmpleats.add(empleat2);
        llistaEmpleats.add(new Empleat("Caca",5));
        llistaEmpleats.add(new Empleat("Bulbasaur", 750));
        llistaEmpleats.add(new Empleat("Alimoche", 500));
        llistaEmpleats.add(new Empleat("Flus", 900));
        llistaEmpleats.add(new Empleat("Queso", 630));
        llistaEmpleats.add(manager1);
        llistaEmpleats.add(new Manager("Zanahoria", 8000, "Verduras", 200));
        
        System.out.println("\n");
        
        for (Empleat e: llistaEmpleats) {
            mostrarDades(e);
        }
        
        System.out.println("S'han creat "+Empleat.getComptador()+" empleats en total.");
        
        try {
            empleat1.finalize();
        } catch (Throwable ex) {
            System.out.println("Impossible destruir");
        }
        
    }
    
    private static void mostrarDades(Empleat obj) { //tambien se le podrian pasar objetos de clase Manager pq heredan de Empleat (UPCASTING implicito)
        
        System.out.println(obj);
        
    }
    
}
