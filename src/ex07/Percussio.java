package ex07;

/**
 * 161015
 * @author mor
 */
public abstract class Percussio extends Instrument {
    
    public Percussio() {
        
        super();
        nivel = 2;
        
    }
    
    @Override
    public String tipusInstrument() {
        return getClass().getName().substring(getClass().getName().indexOf('.')+1); // toda esta movida coge solo el nombre de la clase!!!
    }
    
}
