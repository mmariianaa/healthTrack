/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pantallapricipal;

/**
 *
 * @author holan
 */
public class personas extends List{
    private static String nombre;
    private static String correo; 
    private static String contrasena;
    private static int edad;
    private static double peso;
    private static String sexo;
    private static double altura;

    public static void setDatos(String nombre,String correo,String contrasena,int edad,double peso,String sexo,double altura) {
        personas.nombre = nombre;
        personas.correo=correo;
        personas.contrasena=contrasena;
        personas.edad = edad;
        personas.peso = peso;
        personas.sexo=sexo;
        personas.altura=altura;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        personas.nombre = nombre;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        personas.correo = correo;
    }

    public static String getContrasena() {
        return contrasena;
    }

    public static void setContrasena(String contrasena) {
        personas.contrasena = contrasena;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        personas.edad = edad;
    }

    public static double getPeso() {
        return peso;
    }

    public static void setPeso(double peso) {
        personas.peso = peso;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        personas.sexo = sexo;
    }

    public static double getAltura() {
        return altura;
    }

    public static void setAltura(double altura) {
        personas.altura = altura;
    }
    

}
