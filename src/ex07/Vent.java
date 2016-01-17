package ex07;

/**
 * 161015
 * @author mor
 */
public class Vent extends Instrument {
    
    public Vent() {
        
        super();
        nivel = 2;
        
    }
    
    public void tocar() {
        
        if (!isAfinado()) System.out.println("Instrument de " + tipusInstrument() + " desafinat!"); // tipusInstrument() coge el nombre de la clase
        else System.out.println("S'ha tocat un instrument de " + tipusInstrument() + '.');
        
    }
    
}
