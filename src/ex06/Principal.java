package ex06;

/**
 * 091015
 * @author mor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumne alm1 = new Alumne("Joel",25366203,1312);
        Alumne alm2 = new Alumne("Mor",66666666,666);
        Professor prof1 = new Professor("Mongui",12345678,1500);
        
        System.out.println("Creant matriu de persones...");
        Persona persones[] = new Persona[3];
        
        System.out.println("Copiant objectes a la matriu...\n");
        persones[0] = alm1;
        persones[1] = alm2;
        persones[2] = prof1;
        
        for (Persona p: persones) { //recorre la matriz persones y guarda en p el objeto actual en cada vuelta del bucle
            System.out.println(p);
        }
        
    }
    
}
