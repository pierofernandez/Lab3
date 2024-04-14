/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion_3;

/**
 *
 * @author Estudiante
 */
public class PERSONA2 {
    
    public PERSONA2(){}
    
    private PERSONADATOSBASICOS dataB;
    private PERSONADATOSCONTACTOS dataC;
    private PERSONADATOSREGISTRO dataR;
    
    public PERSONA2(PERSONADATOSBASICOS dataB, PERSONADATOSCONTACTOS dataC, PERSONADATOSREGISTRO dataR){
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataR;
    }

    public PERSONADATOSBASICOS getDataB() {
        return dataB;
    }

    public void setDataB(PERSONADATOSBASICOS dataB) {
        this.dataB = dataB;
    }

    public PERSONADATOSCONTACTOS getDataC() {
        return dataC;
    }

    public void setDataC(PERSONADATOSCONTACTOS dataC) {
        this.dataC = dataC;
    }

    public PERSONADATOSREGISTRO getDataR() {
        return dataR;
    }

    public void setDataR(PERSONADATOSREGISTRO dataR) {
        this.dataR = dataR;
    }
    
}
