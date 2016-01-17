package ex06;

import java.util.Objects;

/**
 * 091015
 * @author mor
 */
public class Persona {
    
    protected String nom;
    protected NIF nif;

    public String getNom() {
        return nom;
    }

    public NIF getNIF() {
        return nif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNIF(int xifres) {
        nif = new NIF(xifres);
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + "\n" + getNIF(); //al poner el getNIF() aqui a pelo, el programa usa el toString() de NIF por lo que es super guay y comodo y no hay que ponerlo 20 veces en cada toString :D
    }

    public Persona() {
        
    }
    
    public Persona(String n, int xifres) {
        
        nom = n;
        nif = new NIF(xifres);
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Persona) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nif.getDNI(), other.nif.getDNI())) {
            return false;
        }
        return true;
    }
    
    
    
}
