/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jugador;
import Vista.JugadorView;

public class JugadorController {

    private  Jugador modelo;
    private JugadorView vista;
    
    public JugadorController(Jugador modelo, JugadorView vista){
    this.modelo = modelo;
    this.vista = vista;
    
    }

    public JugadorController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  public String getNombre(){
  return modelo.getNombre();
  }
    
  public void setNombre(String nombre){
      this.modelo.setNombre(nombre);
  
  }  
    
  public String getRol(){
  return modelo.getRol();
  } 
  
  public void serRol(String rol){
  this.modelo.setRol(rol);
  }
  
  public int getEdad(){
  return modelo.getEdad();
  }
  
  public void setEdad(int edad){
  this.modelo.setEdad(edad);
  }
  
  public String getElo(){
  return modelo.getElo();
  }
  
  public void setElo(String elo){
  this.modelo.setElo(elo);
  }
  
  public void Jugadorvista(){ // METODO QUE TOMA LOS DATOS O MOSTRARA LOS DATOS
  String n;
  vista.MostrarJugadores(modelo.getNombre(),modelo.getRol(), modelo.getEdad(), modelo.getElo());
  }
  
  
}
