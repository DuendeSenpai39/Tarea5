/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea5;

/**
 *
 * @author Jose
 */
public class Atencion {
    String horarioAtencion;
    String nombreLocal;
    int costo;
    Mascota numeroMascota;
    
    public Atencion(String horarioAtencion, String nombreLocal, int costo, Mascota numeroMascota){
        this.horarioAtencion = horarioAtencion;
        this.nombreLocal = nombreLocal;
        this.costo = costo;
        this.numeroMascota = numeroMascota;
}
public String getinfoAtencion(){

    var retorno = "El nombre del local es "+this.nombreLocal+ ", este atiende de "
            + this.horarioAtencion+" , siendo el turno de atencion numero: "
            +this.numeroMascota.numAtencion+" , por lo cual debe cancelar un valor de:"+this.costo+" dolares.";
    return retorno;

}
       
}
