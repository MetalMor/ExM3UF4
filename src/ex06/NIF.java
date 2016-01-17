package ex06;

/**
 * 091015
 * @author mor
 */
public class NIF extends DNI {
    
    private char lletra = calculaLletra();
    
    public NIF(int xifres) {
        
        setDNI(xifres);
        lletra = calculaLletra();
        
    }
    
    public char getLletra() {
        
        return lletra;
        
    }
    
    public char calculaLletra() {
        
        char[] taula = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        return taula[getDNI()%23]; //el residuo de dividir el dni entre 23 da la posicion de la letra q le corresponde
    }

    public char calculaLletra2() {
        
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
                
        return lletres.charAt(getDNI()%23);
        
    }
    
    @Override
    public String toString() {
        return "NIF: " + getDNI() + '-' + calculaLletra() + '.';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof DNI)) return false; //instanceof devuelve true si el objeto es de la clase DNI o sus subclases, sino devuelve false
        final NIF other = (NIF) obj;
        if (this.getDNI() == other.getDNI()) return true;
        return false;
    }
    
}
