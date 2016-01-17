package ex07;

/**
 * 161015
 * @author mor
 */
public abstract class Instrument {
    
    private boolean afinado;
    protected int nivel;
    
    public Instrument() {
        System.out.println("Creant un nou instrument de " + tipusInstrument() + '.');
        afinado = false;
        nivel = 1;
    }
    
    public abstract void tocar();
    
    public void afinar() {
        System.out.println("Afinant instrument...");
        afinado = true;
    }
    
    public String queNivel() {
        return "Aquest instrument és del nivell " + getNivel() + '.';
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setNivel(int n) {
        nivel = n;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public String tipusInstrument() {
        return getClass().getName().substring(getClass().getName().indexOf('.')+1).toLowerCase(); // toda esta movida coge solo el nombre de la clase!!!
    }
    
}
