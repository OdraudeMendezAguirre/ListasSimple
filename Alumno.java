/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author odraude
 */
public class Alumno {
    String nombre;
    double calificacion;
    public Alumno(String nombre, double calificacion)
    {
        this.nombre=nombre;
        this.calificacion=calificacion;
    }
    public Alumno()
    {
        nombre=null;
        calificacion=0.0;
    }
    
   // public String setNombre()
    //{
      //  return nombre;
    //}
    
    //public double setCalificacion()
    //{
      //  return calificacion;
    //}
}
