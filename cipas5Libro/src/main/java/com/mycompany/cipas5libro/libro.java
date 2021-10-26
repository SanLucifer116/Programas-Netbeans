/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cipas5libro;

public class libro {
    
    String codigo;
    String titulo;
    String autor;
    double precio;
    String estado;
    
    libro siguiente;
    
    public libro(){
        this.codigo="";
        this.titulo="";
        this.titulo="";
        this.precio=0.0;
        this.estado="";
        
        this.siguiente=null;
   
    }
    public libro(String codigo, String titulo,String autor,double precio,String estado, libro siguiente){
        this.codigo=codigo;
        this.titulo=titulo;
        this.autor=autor;
        this.precio=precio;
        this.estado=estado;
        
        this.siguiente=siguiente;
    }

    public libro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(libro siguiente) {
        this.siguiente = siguiente;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
}