/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea5;

/**
 *
 * @author Jose
 */
public class Tarea5 {

    public static void main(String[] args) {
        
    var dueño1 = new Dueño("Daniel","0994672138",20);    
    var mascota1 = new Mascota("Bartolo",3,2.5,dueño1);
    var atencion1 = new Atencion("8 am - 20pm","Pulgosos",150,mascota1);
    
    System.out.println(dueño1.getinfoDueño());
    System.out.println(mascota1.getinfoMascota());
    System.out.println(atencion1.getinfoAtencion());
    }
}
