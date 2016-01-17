package ex07;

/**
 * 161015
 * @author mor
 */
public class Platerets extends Percussio {
    
    private final String nivelString;
    
    public Platerets() {
        
        super();
        nivel = 3;
        nivelString = "tres";
        
    }
    
    public void tocar() {
        
        if (!isAfinado()) System.out.println(tipusInstrument() + " desafinats!");
        else System.out.println("S'han tocat uns " + tipusInstrument() + '.');
        
    }
    
    @Override
    public String queNivel() {
        
        return "Aquest instrument és de nivell " + nivelString + ", " + nivel + '.';
        
    }
    
}
