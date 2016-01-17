package herenciaMultiple;

/**
 * 
 * Herencia multiple:
 * No se puede heredar de dos clases asi q hay que transformar el rollo
 * con interficies y delegaciones
 * En este caso, en vez de usar la clase Militar, se hace una interficie
 * Para acceder desde AdvocatMilitar a las operaciones de Militar se
 * hace una delegación
 * 
 * 051115
 * @author mor
 */
public class AdvocatMilitar extends Advocat implements MilitarInterface {
    
    private Militar militar; //delegacion para q utilice las movidas de la clase Militar
    
    public AdvocatMilitar() {
        militar = new Militar();
    }
    
    public String getGrau() {
        return militar.getGrau();
    }
    
    public void setGrau(String g) {
        militar.setGrau(g);
    }
    
}
