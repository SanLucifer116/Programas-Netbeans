/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
//Se importan las clases
import Modelo.Cliente;
import Vista.ClienteView;


public class ClienteController {

//objetos vista y modelo
private ClienteView vista;
private Cliente modelo;
 
//constructor para inicializar el modelo y la vista
public ClienteController(Cliente modelo, ClienteView vista) {
this.modelo = modelo;
this.vista = vista;
}
 
//getters y setters para el modelo
public int getId() {
return modelo.getId();
}
public void setId(int id) {
this.modelo.setId(id);
}
public String getNombre() {
return modelo.getNombre();
}
public void setNombre(String nombre) {
this.modelo.setNombre(nombre);
}
public String getApellido() {
return modelo.getApellido();
}
public void setApellido(String apellido) {
this.modelo.setApellido(apellido);
}
//pasa el modelo a la vista para presentar los datos
public void actualizarVista() {
vista.imprimirDatosCliente(modelo.getId(),modelo.getNombre(), modelo.getApellido());
}
}
    






















