package examen;

/**
 *
 * Clase base persona
 * 
 * @version 1.0
 * @author jose antonio stovall aguilar
 */
public abstract class Persona {

    
    private String nombre;
    private int edad;

    /**
     * Obtiene nombre 
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece nombre de la persona
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad
     * @return edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona
     * @param edad edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * Construcor para crear una persona
     * 
     * @param nombre nombre de la persona
     * @param edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}
