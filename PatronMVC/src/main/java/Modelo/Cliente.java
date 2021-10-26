/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Cliente {
private int id;
private String Nombre;
private String Apellido;


public Cliente() {
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getNombre() {
return Nombre;
}
public void setNombre(String nombre) {
this.Nombre = nombre;
}
public String getApellido() {
return Apellido;
}
public void setApellido(String apellido) {
this.Apellido = apellido;
}
}
