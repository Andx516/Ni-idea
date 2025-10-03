/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Objects; // Importar Objects para validaciones.

/**
 * Representa a un usuario interesado en ver el portafolio o el perfil académico de un Alumno.
 *
 * <p>El objetivo principal de esta clase es tener una referencia a un Alumno
 * y proporcionar un método para mostrar la información relevante de su perfil.
 *
 * @author Profesor: Francisco Javier Montecillo Puente. Alumno: Andrea Vega Villanueva 
 * Materia: Taller de investigación 1. TI-701
 * @version 1.0
 * @since 2025-10-03
 * @see Alumno
 */
public class Interesado {

    /**
     * Referencia al objeto Alumno cuyo portafolio o perfil se desea consultar.
     */
    private Alumno alumnoEnRevision;

    /**
     * Constructor que permite inicializar al Interesado con el Alumno
     * cuyo portafolio desea ver.
     *
     * @param alumno El objeto Alumno a revisar.
     */
    public Interesado(Alumno alumno) {
        // Se utiliza Objects.requireNonNull para asegurar que la referencia no sea nula.
        this.alumnoEnRevision = Objects.requireNonNull(
            alumno, "La referencia al Alumno no puede ser nula.");
    }

    /**
     * Muestra en consola la información esencial del perfil o "portafolio"
     * académico del Alumno en revisión.
     *
     * <p>Utiliza los métodos de acceso (getters) de la clase Alumno para
     * obtener los datos.
     */
    public void verPortafolioDelAlumno() {
        if (this.alumnoEnRevision != null) {
            System.out.println("--- Portafolio del Alumno ---");
            System.out.println("No. de Control: " + this.alumnoEnRevision.getNoControl());
            System.out.println("Cursos Inscritos: " + this.alumnoEnRevision.getCursos());
            System.out.println("Calificación Promedio: " + this.alumnoEnRevision.getCalificacion());
            System.out.println("-----------------------------");
        } else {
            System.out.println("No hay un alumno asignado para revisión.");
        }
    }


    /**
     * Obtiene la referencia al objeto Alumno que está siendo revisado.
     *
     * @return El objeto {@code Alumno}.
     */
    public Alumno getAlumnoEnRevision() {
        return alumnoEnRevision;
    }

    /**
     * Establece o cambia el Alumno cuyo portafolio será revisado.
     *
     * @param alumnoEnRevision El nuevo objeto Alumno a revisar.
     */
    public void setAlumnoEnRevision(Alumno alumnoEnRevision) {
        this.alumnoEnRevision = alumnoEnRevision;
    }
}
