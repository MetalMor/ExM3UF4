package herencia;

import java.util.Objects;

/**
 * 081015
 * @author mor
 */
public class Empleat extends Persona {
    
    private String nom;
    private double sal;
    private static int comptador;
    
    public Empleat (String aNom, double aSal) {
        
        nom = aNom;
        sal = aSal;
        
        System.out.println(tipusEmpleat()+" creat: "+getNom());
        Empleat.StaticCounter();
        
    }

    public Empleat() { //constructor vacío inicializa valores por defecto
        
        setNom("Pepito"); //aqui no hace falta poner "this" ni el objeto ni na (?)
        setSal(1500.0);
        
        System.out.println(tipusEmpleat()+" creat: "+getNom());
        Empleat.StaticCounter();
        
    }
    
    public static void StaticCounter() {
        comptador++;
    }
    
    public static int getComptador() {
        return comptador;
    }

    public String getNom() {
        return nom;
    }

    public double getSal() {
        return sal;
    }

    public void setNom(String aNom) {
        nom = aNom;
    }

    public void setSal(double aSal) {
        sal = aSal;
    }
    // alt + insert para poner automaticamente constructores y accesores

    @Override
    public String toString() {
        return tipusEmpleat()+" amb nom "+this.getNom()+" i salari "+this.getSal()+"."; //esto rula cuando intentas meter un objeto de la clase Empleat en un System.out.println()
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { //mira q el objeto no esté vacío
            return false;
        }
        if (obj instanceof Empleat) { //mira q el objeto q le pasamos sea una instancia de Empleat (es decir Empleat o Manager)
            return false;
        }
        final Empleat other = (Empleat) obj;
        if (nom.equals(other.nom)) return true; //comprueba si son iguales (en este caso si tienen el mismo salario)
        return false;
    }
    
    public String tipusEmpleat() {
        return getClass().getName().substring(getClass().getName().indexOf('.')+1); // toda esta movida coge solo el nombre de la clase!!!
    }
    
    @Override
    protected void finalize() throws Throwable { // destructor: a la hora de destruir objetos, el contador decrementa en 1
        comptador--;
    }

    @Override
    public String mostrarDades() {
        return this.toString();
    }
    
}
