/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import Modelo.Serie;
import Vista.SerieView;
import Controlador.SerieController;


public class Demo {
    
public static void main (String [] args){


Serie modelo = llenarDatosSerie();
SerieView vista  =new  SerieView();

SerieController controlador = new SerieController(modelo,vista);


controlador.ActualizarVista();
controlador.setMin(1500);
controlador.setNombre("Ley del Corazon 2 ");
controlador.setAño(2019);
controlador.ActualizarVista();

}



private static Serie llenarDatosSerie(){
Serie cliente = new Serie();
cliente.setMin(1200);
cliente.setNombre("Ley del Corazon");
cliente.setAño(2016);
return cliente;


}


}
