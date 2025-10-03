/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package domain;

/**
 * Representa un logro o una habilidad ya adquirida por un alumno,
 * respaldada por el diagnóstico reslizado en la clase.
 *
 * <p>Esta clase almacena la identificación, la categoría y una descripción
 * detallada del logro alcanzado.
 *
 * @author Andrea Vega Villanueva
 * @version 1.0
 * @since 2025-10-02
 */
public class Logro {
    
    /**
     * Identificador único del logro.
     */
    private int id;
    
    /**
     * Categoría a la que pertenece el logro (e.g., "Programación", "Liderazgo").
     */
    private String categoria;
    
    /**
     * Descripción detallada de la habilidad o el logro adquirido.
     */
    private String descripción; // Nota: Se mantiene el nombre con acento según el código original.

    /**
     * Constructor para crear una instancia completa de Logro.
     *
     * @param id El identificador único del logro.
     * @param categoria La categoría a la que pertenece el logro.
     * @param descripción La descripción detallada del logro.
     */
    public Logro(int id, String categoria, String descripción) {
        this.id = id;
        this.categoria = categoria;
        this.descripción = descripción;
    }

    /**
     * Obtiene el identificador único del logro.
     *
     * @return El {@code int} que representa el ID del logro.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene la categoría a la que pertenece el logro.
     *
     * @return El {@code String} que representa la categoría.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Obtiene la descripción detallada del logro.
     *
     * @return El {@code String} que contiene la descripción.
     */
    public String getDescripción() {
        return descripción;
    }


    /**
     * Establece o actualiza el identificador único del logro.
     *
     * @param id El nuevo ID del logro.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Establece o actualiza la categoría del logro.
     *
     * @param categoria La nueva categoría para el logro.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Establece o actualiza la descripción detallada del logro.
     *
     * @param descripción La nueva descripción del logro.
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
}