/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea5;

/**
 *
 * @author Jose
 */
public class Mascota {
    String nombreMascota;
    int numAtencion;
    double edad;
    Dueño dueño;
    
    public Mascota(String nombreMascota , int numAtencion, double edad, Dueño dueño){
        this.nombreMascota = nombreMascota;
        this.numAtencion = numAtencion;
        this.edad = edad;
        this.dueño = dueño;
}
public String getinfoMascota(){

    var retorno = "El nombre de la mascota es "+this.nombreMascota+ ", siendo su dueño "
            + this.dueño.nombreDueño+" , el perro tiene: "
            +this.edad+" años de edad, y su turno de atencion es el: "+this.numAtencion;
    return retorno;
}       
}

