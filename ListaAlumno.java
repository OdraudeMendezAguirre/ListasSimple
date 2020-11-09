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
public class ListaAlumno {
     Nodo primero;
    private String nombre;
    private double calificacion;
    
    public ListaAlumno()
    {
        primero=null;
        
    }
    
    public ListaAlumno crearLista()
    {
        Alumno alumno;
        primero=null;
        alumno=getAlumno();
        if(alumno!=null)
        {
            primero=new Nodo(alumno,primero);
        }
        return this;
    }
    
    
    public Alumno getAlumno()
    {
        Alumno alumno=new Alumno(nombre,calificacion);
        return(alumno);
    }
    
    public void obtenerNombre(String nombre)
    {
        this.nombre= nombre; 
    }
    
    public void obtenerCalificacion(double calificacion)
    {
        this.calificacion= calificacion;
    }
    
    public ListaAlumno añadir(Alumno alumno)
    {
        Nodo nuevo;
        nuevo=new Nodo(alumno);
        nuevo.enlace=primero;
        primero=nuevo;
        return this;
    }
    
    public ListaAlumno insertarEntre(Nodo anterior, Alumno alum)
    {
        Nodo nuevo;
        nuevo=new Nodo(alum);
        nuevo.enlace=anterior.enlace;
        anterior.enlace=nuevo;
        return this;
    }
    
    public Alumno consultar(String nombre)
    {
        Nodo indice;
        for(indice=primero;indice!=null;indice=indice.enlace)
            if(nombre.equals(indice.alumno.nombre))
                return indice.getAlumno();
        return null;
    }
    
    public void eliminar(Alumno alumno)
    {
        Nodo actual, anterior;
        boolean encontrado;
        actual=primero;
        anterior=null;
        encontrado=false;
        while ((actual !=null)&&(!encontrado))
        {
            encontrado=(actual.alumno.equals(alumno));
            if(!encontrado)
            {
                anterior=actual;
                actual=actual.enlace;
            }
        }
        if(actual !=null)
        {
            if(actual==primero)
            {
                primero=actual.enlace;
            }
            else{
                anterior.enlace=actual.enlace;
            }
            actual=null;
        }
        
    }
    
    public ListaAlumno Ordenar(Alumno alumno)
    {
        Nodo nuevo;
        nuevo=new Nodo(alumno);
        if(primero==null)
            primero=nuevo;
        else if(alumno.calificacion<primero.getAlumno().calificacion)
        {
            nuevo.setEnlace(primero);
            primero=nuevo;
        }
        else{
            Nodo anterior,p;
            anterior=p=primero;
            while((p.getEnlace() != null)&&(alumno.calificacion>p.getAlumno().calificacion))
            {
                anterior=p;
                p=p.getEnlace();
            }
            if(alumno.calificacion>p.getAlumno().calificacion)
            {
                anterior=p;
                nuevo.setEnlace(anterior.getEnlace());
                anterior.setEnlace(nuevo);
            }
            
        }
        return this;
    }
    
    public void modificar(Nodo nd, Alumno cambio)
    {
        insertarEntre(nd,cambio);
        eliminar(nd.getAlumno());
    }
}
