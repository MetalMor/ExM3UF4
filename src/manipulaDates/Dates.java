package manipulaDates;

import java.util.*;

/**
 * Clase Date: para guardar fechas y eso, pero no para manipularlas
 * recomendable para atributos
 * 
 * Clase GregorianCalendar: para manipular datos de fechas y tiempo
 * 
 * 291015
 * @author mor
 */
public class Dates {
    public static void main(String[] args) {
        Date data1 = new Date(); // fecha y hora actuales (UNIX date)
        System.out.println(data1);
        
        Calendar data2 = new GregorianCalendar(1995,11,13);
        System.out.println(data2.get(Calendar.DAY_OF_MONTH)+
                "/"+data2.get(Calendar.MONTH)+
                "/"+data2.get(Calendar.YEAR));
        
        data2.set(2015, 0, 1);
        data2.setTime(data1); // pasa un objeto Date a un GregorianCalendar
        System.out.println(data2.get(Calendar.DAY_OF_MONTH)+
                "/"+data2.get(Calendar.MONTH)+
                "/"+data2.get(Calendar.YEAR));
        
        data1.setTime(data2.getTimeInMillis()); // le pasa los milisegundos en UNIX date a un objeto Date desde GregorianCalendar
        
        data2.add(Calendar.DAY_OF_MONTH, 32); // agrega tiempo al objeto, add(campo, cantidad)
    }
}
