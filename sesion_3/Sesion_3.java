/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sesion_3;

/**
 *
 * @author Estudiante
 */
public class Sesion_3 {

    public static void main(String[] args) {
        
  
        PERSONADATOSBASICOS dataB = new PERSONADATOSBASICOS("Juan", "Dias", "005887464");
        PERSONADATOSCONTACTOS dataC = new PERSONADATOSCONTACTOS("av. Mexico", " pier@gmail,cin","645656546");
        PERSONADATOSREGISTRO dataR = new PERSONADATOSREGISTRO("Juan10"," 140220ILP","CHnael@gmail.com");
        
        
       PERSONA2 per = new PERSONA2(dataB, dataC, dataR);
        
        PERSONA1 marcos = PERSONA1.marcos();
        PERSONA1 carlos = PERSONA1.carlos();
        PERSONA1 juanita = PERSONA1.juanita();
        
    }
}
