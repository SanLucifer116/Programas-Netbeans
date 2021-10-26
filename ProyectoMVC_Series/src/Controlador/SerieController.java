/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Serie;
import Vista.SerieView;



public class SerieController {
    

    private Serie modelo;
    private SerieView vista;

 public SerieController ( Serie pModelo, SerieView pVista){
 
     modelo = pModelo;
     vista = pVista;
  
 
 
 }

 public int getMin() {
        return modelo.getMin();
    }

    public void setMin(int min) {
        this.modelo.setMin(min);
    }

    public String getNombre() {
        return modelo.getNombre();
    }

    public void setNombre(String nombre) {
        this.modelo.setNombre(nombre);
    }

    public int getAño() {
        return modelo.getAño();
    }

    public void setAño(int año) {
        this.modelo.setAño(año);
    }




public void ActualizarVista(){
 
 vista.imprimirDatosCliente(modelo.getMin(),modelo.getNombre(), modelo.getAño());
 
 
 
 }








}


