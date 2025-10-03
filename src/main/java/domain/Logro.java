/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Proyecto ni idea
Clase logro: Respresenta una habilidad ya adquierida del alumno mediante una evidencia
Docenete: FJMP
Programador: Andrea Vega Villanueva
Fecha: 02-10-2025
 */
package domain;

/**
 *
 * @author andre
 */
public class Logro {
    private int id            ;
    private String categoria  ;
    private String descripción;

    public Logro(int id, String categoria, String descripción) {
        this.id = id;
        this.categoria = categoria;
        this.descripción = descripción;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescripción() {
        return descripción;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    //Crear clase logro bin
    
}
