
package com.mycompany.cipa9libro;

public class Libro {
    int estado;
    String titulo, autor,codigo;;
    double precio;
    Libro siguiente;   // PUNTERO DE LA DIRECCIÓN 

    public Libro() {

        this.codigo = "";
        this.titulo = "";
        this.autor = "";
        this.precio = 0.0;
        this.estado = 0;
        this.siguiente = null; //SE DECLAR TIPO NULL
    }

    public Libro(String codigo, String titulo, String autor, double precio, int estado, Libro siguiente) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.estado = estado;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Libro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Libro siguiente) {
        this.siguiente = siguiente;
    }

}
