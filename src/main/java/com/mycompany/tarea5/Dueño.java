/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea5;

/**
 *
 * @author Jose
 */
public class Dueño {
    String nombreDueño;
    String numeroContacto;
    int edad;
    
    public Dueño(String nombreDueño, String numeroContacto, int edad){
        this.nombreDueño = nombreDueño;
        this.numeroContacto = numeroContacto;
        this.edad = edad;

}
public String getinfoDueño(){

    var retorno = "El nombre del dueño es "+this.nombreDueño+ ", tiene la edad de: "
            + this.edad+" , y su numero de contacto es el: "
            +this.numeroContacto;
    return retorno;

}      
}
    
