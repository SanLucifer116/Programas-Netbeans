/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

public class ClienteView {
public void imprimirDatosCliente(int id,String nombre, String apellido) {
JOptionPane.showMessageDialog(null,"**** DATOS CLIENTE ****"+
        "\n Id: "+id+"\nNombre: "+nombre+"\nApellido: "+apellido );


}
}