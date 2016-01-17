package ex07;

/**
 * 161015
 * @author mor
 */
public class Tambor extends Percussio {
    
    public Tambor() {
        
        super();
        nivel = 3;
        
    }
    
    public void tocar() {
        
        if (!isAfinado()) System.out.println(tipusInstrument() + " desafinat!");
        else System.out.println("S'ha tocat un " + tipusInstrument() + '.');
        
    }
    
}
