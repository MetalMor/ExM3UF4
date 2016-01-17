package ex08;

/**
 *
 * 291015
 * @author mor
 */
public enum Nota {
    INSUFICIENT("I"),
    SUFICIENT("S"),
    BE("B"),
    NOTABLE("N"),
    EXCELENT("E");
    
    private final String description;
    
    private Nota(String d) { // Constructor de la enumeracion (sino no se pueden poner descripciones)
        description = d;
    }
    
    protected String getDescription() {
        return description;
    }
}
