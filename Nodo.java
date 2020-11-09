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
public class Nodo {
    protected Alumno alumno;
    protected Nodo enlace;
    public Nodo(Alumno alumno)
    {
        this.alumno=alumno;
        enlace=null;
    }
    public Nodo(Alumno alumno, Nodo n)
    {
        this.alumno=alumno;
        enlace=n;
    }

    
    public Alumno getAlumno()
    {
        return (alumno);
    }
    
    public Nodo getEnlace()
    {
        return(enlace);
    }
    
    public void setEnlace(Nodo enlace)
    {
        this.enlace=enlace;
    }
}
