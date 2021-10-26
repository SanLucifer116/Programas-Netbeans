/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDTO;

import BusinessObject.Enfermos_BO;
import ValueObject.Enfermos_VO;


    public class DTO {
        public static void main(String[] args) {
        
            Enfermos_BO enfermoBusinessObject = new Enfermos_BO();
            enfermoBusinessObject.obtenerUsuario().forEach(System.out::println);

            System.out.println("**");
            Enfermos_VO enfermo = enfermoBusinessObject.ObtenerUsuario(3);
            enfermo.setNombre("Fernanda");
            enfermoBusinessObject.ActualizarUsuario(enfermo);
        
        
        
            System.out.println("**");
            enfermo= enfermoBusinessObject.ObtenerUsuario(3);
            System.out.println(enfermo);
        
        
        
            System.out.println("*******");
            enfermo = enfermoBusinessObject.ObtenerUsuario(3);
            enfermoBusinessObject.eliminarUsuario(enfermo);
      }
        
        
    }     
        
        
        
        
        
        
        
        
        
        
        
        
        

    
