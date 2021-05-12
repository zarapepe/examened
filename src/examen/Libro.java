package examen;


/**
 * 
 * Clase para manajear el control de libro
 * 
 * @version 1.0
 * @author jose antonio stovall aguilar
 */
public class Libro {
    
    private String nombre;
    private String editorial;
    private String autor;
    private int año;
    public boolean prestado;

    /**
     * Retorna nombre del libro
     * @return nombre del libro
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece nombre del libro
     * @param nombre nombre del libro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene editorial
     * @return editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Establece nombre editorial
     * @param editorial nombre editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

  
    /**
     * Obtiene autor
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece autor
     * @param autor nombre autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtienen el año
     * @return añor del libro
     */
    public int getAño() {
        return año;
    }

    /**
     * Establece año del libro
     * @param año año del libro
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Verifica que esta prestado
     * @return si esta prestado
     */
    public boolean isPrestado() {
        return prestado;
    }

    /**
     * Establece si esta prestado
     * @param prestado estado del libro
     */
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    /**
     * Construcor de libro
     * 
     * @param nombre nombre del libro
     * @param editorial nombre de la editorial
     * @param autor nombre del autor
     * @param año año del libro
     * @param prestado estado del libro
     */
    public Libro(String nombre, String editorial, String autor, int año, boolean prestado) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.año = año;
        this.prestado = prestado;
    }
    
    
    
}
