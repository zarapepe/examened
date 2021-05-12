package examen;

/**
 *
 * Clase para crear un socio
 * 
 * @version 1.0
 * @author jose antonio stovall aguilar
 */
public class Socio extends Persona {

    private int telefono;

    /**
     * Saca un libro de la biblioteca
     * @param nombre nombre del libro
     */
    private void sacarLibro(String nombre) {

    }

    /**
     * Devuelve un libro a la biblioteca
     * @param nombre nombre del libro
     */
    private void devolverLibro(String nombre) {

    }

    
    /**
     * Obtiene el telefono del socio
     * @return telefono del socio
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece un numero de telefono
     * @param telefono numero del socio
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Crea un socio
     * @param telefono telefono del socio
     * @param nombre nombre del socio
     * @param edad  edad del socio
     */
    public Socio(int telefono, String nombre, int edad) {
        super(nombre, edad);
        this.telefono = telefono;
    }

}
