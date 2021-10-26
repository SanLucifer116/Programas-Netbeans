/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.*;
import Modelo.Jugador;

public class JugadorView {
 public void AgregarJugador(String nombre, String rol, int edad, String elo){
   
     for(int i=0;i<2;i++){
     nombre= JOptionPane.showInputDialog(null, "Nombre del jugador");
     rol= JOptionPane.showInputDialog(null, "Rol Jugador");
     edad=Integer.parseInt(JOptionPane.showInputDialog(null, "Edad Jugador"));
     elo=JOptionPane.showInputDialog(null, "Elo del Jugador");
    }
    }
 
 public void MostrarJugadores(String nombre, String rol, int edad, String elo){
     
     for(int i=0;i<2;i++){
     
        
         
         
         JOptionPane.showMessageDialog(null,"**** DATOS JUGADOR ****"+
        "\n Nombre "+nombre+"\nRol: "+rol+"\nEdad: "+edad+ "\nElo: "+elo );
     
     
     
     }
 
 
 }


}
