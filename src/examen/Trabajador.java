package examen;

/**
 * 
 * 
 * Clase para crear un trabajador
 * 
 * @version 1.0
 * @author jose antonio stovall aguilar
 */
public class Trabajador extends Persona {

    
    private float salario;

    /**
     * Comprueba si esta disponible un libro en la biblioteca
     * @param nombre nombre del libro
     * @return si esta disponible o no
     */
    public boolean disponible(String nombre) {
        return false;
    }

    /**
     * Actualiza el estado del prestamo de un libro
     * @param nombre nombre del libro
     */
    private void actualizarPrestamo(String nombre) {

    }

    /**
     * Obtiene el salario del trabajador
     * @return salario del trabajador
     */
    public float getSalario() {
        return salario;
    }

    /**
     * Establece el salario del trabajador
     * @param salario salario del trabajador
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * Crea un trabajador
     * 
     * @param salario salario del trabajador
     * @param nombre nombre del trabajador
     * @param edad  edad del trabajador
     */
    public Trabajador(float salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }

}
