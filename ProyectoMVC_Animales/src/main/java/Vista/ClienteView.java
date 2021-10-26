/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

public class ClienteView {
public void imprimirDatosCliente(int ident, int edad,String nombre, String raza) {
JOptionPane.showMessageDialog(null,"**** DATOS MASCOTA ****"+
        "\n Id: "+ident+"\nEdad: "+ edad + " Años"+"\nNombre: "+nombre+"\nRaza: "+raza );


}
}