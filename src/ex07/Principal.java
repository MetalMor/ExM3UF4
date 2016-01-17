package ex07;

/**
 * 161015
 * @author mor
 */
public class Principal {
    
    public static void main (String[] args) {
        
        Instrument[] instruments = new Instrument[4];
        
        instruments[0] = new Tambor();
        instruments[1] = new Vent();
        instruments[2] = new Corda();
        instruments[3] = new Platerets(); // aunque no tenga nada definido, ejecuta los metodos heredados de Instrument (polimorfismo???)
        
        System.out.println("________");
        System.out.println("________\n");
        
        System.out.println("Ara comprovarem els instruments.");
        
        System.out.println("________");
        System.out.println("________\n");
        
        for (Instrument inst:instruments) {
            
            System.out.println(inst.queNivel());
            inst.tocar();
            
            System.out.println("________\n");
            
        }
        
        System.out.println("________\n");
        
        System.out.println("Els instruments estan desafinats! Ara toca afinar-los tots.");
        
        System.out.println("________");
        System.out.println("________\n");
        
        for (Instrument inst:instruments) {
            
            inst.tocar();
            inst.afinar();
            inst.tocar();
            
            System.out.println("________\n");
            
        }
        
    }
    
}
