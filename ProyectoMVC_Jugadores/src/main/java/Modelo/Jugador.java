/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Jugador {
    
    String nombre;
    String rol;
    int edad;
    String elo;
       
    
    public Jugador(){
     this.nombre = " ";
        this.rol = " ";
        this.edad = 0;
        this.elo = " ";
    
    
    
    }

    public Jugador(String nombre, String rol, int edad, String elo) {
     this.nombre = nombre;
        this.rol = rol;
        this.edad = edad;
        this.elo = elo;  
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public int getEdad() {
        return edad;
    }

    public String getElo() {
        return elo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setElo(String elo) {
        this.elo = elo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
