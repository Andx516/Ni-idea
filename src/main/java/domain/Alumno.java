/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Instituto Tecnológico Superior de Salvatierra. Itess.
 * @author Profesor: Francisco Javier Montecillo Puente. Alumno: Andrea Vega Villanueva 
 * Materia: Taller de investigación 1. TI-701
 * @since 2025-10-03
 * @version 1.0
 */
/**
 * Representa a un alumno con su número de control, la cantidad de cursos
 * en los que está inscrito y su calificación promedio.
 *
 * <p>Esta clase provee métodos para acceder y modificar los atributos del alumno.
 */
public class Alumno {

    /**
     * El número de control único del alumno (identificador).
     */
    private String noControl;

    /**
     * La cantidad de cursos en los que el alumno está inscrito.
     */
    private int cursos;

    /**
     * La calificación promedio o final del alumno.
     */
    private int calificacion;

    /**
     * Constructor que inicializa todos los atributos del alumno.
     *
     * @param noControl El número de control del alumno.
     * @param cursos La cantidad de cursos del alumno.
     * @param calificacion La calificación del alumno.
     * /
    public Alumno(String noControl, int cursos, int calificacion) {
        this.noControl = noControl;
        this.cursos = cursos;
        this.calificacion = calificacion;
    }
    */
    
    public Alumno(String noControl, int cursos, int calificacion) {
        this.noControl = noControl;
        this.cursos = cursos;
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el número de control del alumno.
     *
     * @return El {@code String} que representa el número de control del alumno.
     */
    public String getNoControl() {
        return noControl;
    }

    /**
     * Obtiene la cantidad de cursos en los que el alumno está inscrito.
     *
     * @return El {@code int} que representa el número de cursos.
     */
    public int getCursos() {
        return cursos;
    }

    /**
     * Obtiene la calificación del alumno.
     *
     * @return El {@code int} que representa la calificación.
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Establece o actualiza el número de control del alumno.
     *
     * @param noControl El nuevo número de control del alumno.
     */
    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    /**
     * Establece o actualiza la cantidad de cursos del alumno.
     *
     * @param cursos El nuevo número de cursos.
     */
    public void setCursos(int cursos) {
        this.cursos = cursos;
    }

    /**
     * Establece o actualiza la calificación del alumno.
     *
     * @param calificacion La nueva calificación.
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}