package ex04;

import java.util.*;

/**
 * Programa que hace un calendario del mes actual con GregorianCalendar
 * 
 * 291015
 * @author mor
 */
public class Calendari {
    
    public static void main(String[] args) {
        
        Calendar data = new GregorianCalendar();
        Calendar data2 = (Calendar) data.clone();
        
        data.set(Calendar.DAY_OF_MONTH,1); // pone el dia del mes a 1 para empezar a contar desde el principio
        int i = data.get(Calendar.DAY_OF_WEEK); // recoge el dia de la semana en numero
        
        while (i > 0) {
            System.out.print("\t"); // si el dia 1 no corresponde a lunes, dejará un espacio \t por cada dia hasta llegar al correspondiente
            i--;
        }
        
        //data.get(Calendar.WEEK_OF_MONTH);
        
        while (data.get(Calendar.MONTH) == data2.get(Calendar.MONTH)) { // el bucle dura hasta q llegue al maximo de dias q tiene el mes actual
            
            System.out.print(data.get(Calendar.DAY_OF_MONTH)+"\t"); // printa un dia en número
            
            if(data.get(Calendar.DAY_OF_WEEK) == data.getMaximum(Calendar.DAY_OF_WEEK))
                System.out.print("\n\t"); // si el dia de la semana es igual al maximo de dias q tiene una semana, salto de linea
            
            data.add(Calendar.DAY_OF_MONTH, 1); // agrega 1 al campo DAY_OF_MONTH (dias en el mes)
        }
    }
    
}
