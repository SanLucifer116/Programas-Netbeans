/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Cliente;
import Vista.ClienteView;

public class ClienteController {
    private ClienteView vista;
    private Cliente modelo;

    public ClienteController(Cliente modelo, ClienteView vista) {
    this.modelo = modelo;
    this.vista = vista;
    
    }
    //getters y setters para el modelo
    public int getIdent() {
    return modelo.getIdent();
    }
    public void setIdent(int ident) {
    this.modelo.setIdent(ident);
    }
  
    public String getNombre() {
    return modelo.getNombre();
    }
      public int getEdad(){
    return modelo.getEdad();
    }
    public void setEdad(int edad){
    this.modelo.setEdad(edad);
    }
    public void setNombre(String nombre) {
    this.modelo.setNombre(nombre);
    }
    public String getRaza() {
    return modelo.getRaza();
    }
    public void setRaza(String raza) {
    this.modelo.setRaza(raza);
    }

    public void actualizarVista() {
    vista.imprimirDatosCliente(modelo.getIdent(),modelo.getEdad(),modelo.getNombre(), modelo.getRaza());
    }
    
    
    
    
    
    
    
    
    
    
    
}
