/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import java.util.ArrayList;

/**
 * Representa el Portafolio Académico y Profesional completo de un Alumno.
 *
 * <p>Esta clase agrupa las evidencias clave del desempeño del alumno,
 * incluyendo logros específicos, certificados obtenidos, proyectos realizados 
 * académicos o independientes y su registro de calificaciones.
 *
 * @author Profesor: Francisco Javier Montecillo Puente
 * Alumna: Andrea Vega Villanueva
 * Materia: Taller de investigación 1. TI-701
 * @version 1.0
 * @since 2025-10-03
 * @see Logro
 * @see Alumno
 */
public class Portafolio {
    
    /**
     * Lista de logros específicos que el alumno ha adquirido (e.g., habilidades).
     * Se asume que la clase Logro existe en el paquete domain.
     */
    private List<Logro> logros;
    
    /**
     * Lista de los certificados o diplomas obtenidos por el alumno (e.g., cursos externos).
     */
    private List<String> certificados;
    
    /**
     * Lista de los proyectos o trabajos relevantes que el alumno ha completado.
     * Podría ser una clase 'Proyecto' más adelante, pero por ahora se deja como String.
     */
    private List<String> proyectos;
    
    /**
     * La calificación promedio general o final del alumno.
     * Se recomienda usar 'double' o 'float' para mayor precisión en calificaciones.
     */
    private double calificacionPromedio; 

    /**
     * Constructor por defecto. Inicializa las listas para evitar errores de NullPointerException.
     */
    public Portafolio() {
        this.logros = new ArrayList<>();
        this.certificados = new ArrayList<>();
        this.proyectos = new ArrayList<>();
        this.calificacionPromedio = 0.0;
    }
    
    /**
     * Constructor para inicializar el portafolio con la calificación promedio.
     *
     * @param calificacionPromedio La calificación promedio del alumno.
     */
    public Portafolio(double calificacionPromedio) {
        this(); // Llama al constructor por defecto para inicializar las listas
        this.calificacionPromedio = calificacionPromedio;
    }

    /**
     * Obtiene la lista de logros del alumno.
     *
     * @return La {@code List<Logro>} de todos los logros del portafolio.
     */
    public List<Logro> getLogros() {
        return logros;
    }

    /**
     * Obtiene la lista de certificados del alumno.
     *
     * @return La {@code List<String>} de todos los certificados obtenidos.
     */
    public List<String> getCertificados() {
        return certificados;
    }

    /**
     * Obtiene la lista de proyectos realizados por el alumno.
     *
     * @return La {@code List<String>} de todos los proyectos en el portafolio.
     */
    public List<String> getProyectos() {
        return proyectos;
    }

    /**
     * Obtiene la calificación promedio general del alumno.
     *
     * @return El {@code double} que representa la calificación promedio.
     */
    public double getCalificacionPromedio() {
        return calificacionPromedio;
    }

    /**
     * Establece o actualiza la lista completa de logros.
     *
     * @param logros La nueva lista de logros.
     */
    public void setLogros(List<Logro> logros) {
        this.logros = logros;
    }

    /**
     * Establece o actualiza la lista completa de certificados.
     *
     * @param certificados La nueva lista de certificados.
     */
    public void setCertificados(List<String> certificados) {
        this.certificados = certificados;
    }

    /**
     * Establece o actualiza la lista completa de proyectos.
     *
     * @param proyectos La nueva lista de proyectos.
     */
    public void setProyectos(List<String> proyectos) {
        this.proyectos = proyectos;
    }

    /**
     * Establece o actualiza la calificación promedio general del alumno.
     *
     * @param calificacionPromedio La nueva calificación promedio.
     */
    public void setCalificacionPromedio(double calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }
    
    /**
     * Agrega un nuevo logro a la lista del portafolio.
     *
     * @param logro El objeto Logro a añadir.
     */
    public void agregarLogro(Logro logro) {
        this.logros.add(logro);
    }
    
    /**
     * Agrega un nuevo certificado a la lista del portafolio.
     *
     * @param certificado El String que describe el certificado.
     */
    public void agregarCertificado(String certificado) {
        this.certificados.add(certificado);
    }
    
    /**
     * Agrega un nuevo proyecto a la lista del portafolio.
     *
     * @param proyecto El String que describe el proyecto.
     */
    public void agregarProyecto(String proyecto) {
        this.proyectos.add(proyecto);
    }
}
