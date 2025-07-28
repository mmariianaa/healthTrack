/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantallapricipal;

/**
 *
 * @author holan
 */

public class Sesiones {
    private static Sesiones instance;
    private personas personaLogueada;
    
    private Sesiones(){}
    
    public static Sesiones getInstance(){
        if(instance==null){
            instance=new Sesiones();
        }
        return instance;
    }
    
    public void setPersona(personas persona){
        this.personaLogueada=persona;
    }
    
    public personas getPersona(){
        return personaLogueada;
    }
    
    public void clear(){
        personaLogueada=null;
    }
    
}

