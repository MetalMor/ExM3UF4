package ex06;

/**
 * 091015
 * @author mor
 */
public class Professor extends Persona {
    
    protected double sou;
    
    public double getSou() {
        
        return sou;
        
    }
    
    public void setSou(double s) {
        
        sou = s;
        
    }
    
    public String toString() {
        
        return super.toString() + "\nSou: " + getSou();
        
    }
    
    public Professor(String nom, int xifres, double s) {
        
        setSou(s);
        super.setNom(nom);
        super.setNIF(xifres);
        
        System.out.println("Instanciat el professor " + getNom() + " amb el NIF " + nif.getDNI() + "-" + nif.getLletra() + " i que cobra " + getSou() + ".");
        
    }
    
}
