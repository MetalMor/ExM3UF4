package ex06;

/**
 * 091015
 * @author mor
 */
public class Alumne extends Persona {
    
    protected int numAlumne;
    
    public int getNumAlumne() {
        
        return numAlumne;
        
    }
    
    public void setNumAlumne(int num) {
        
        numAlumne = num;
        
    }
    
    public Alumne() {
        
    }
    
    public Alumne(String nom, int xifres, int nAlumne) {
        
        setNumAlumne(nAlumne);
        super.setNom(nom);
        super.setNIF(xifres);
        
        System.out.println("Instanciant l'alumne " + getNom() + " amb el NIF " + nif.getDNI() + "-" + nif.getLletra() + " i ID " + getNumAlumne()+ ".");
        
    }
    
    @Override
    public String toString() {
        
        return super.toString() + "\nID de l'alumne: " + getNumAlumne();
        
    }
    
}
