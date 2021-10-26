/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObject;

import java.util.ArrayList;
import java.util.List;
import ValueObject.Enfermos_VO;

public class Enfermos_BO {
    
    List<Enfermos_VO> enfermos;
    
    public Enfermos_BO(){
    
    enfermos= new ArrayList<>();
        Enfermos_VO enfermo1 = new Enfermos_VO(123458, 56 , "Carlos Samper", " Cancer de Higado");
        Enfermos_VO enfermo2 = new Enfermos_VO(3123, 30,"Camila Marin", "Diabetes");
        Enfermos_VO enfermo3 = new Enfermos_VO(123123, 82 ,"Catalina Castro ", " pendeja ");
        enfermos.add(enfermo1);
        enfermos.add(enfermo2);
        enfermos.add(enfermo3);
    
          
    
    }
    
     //elimina el cliente que se le pasa como paraámetro
    public void eliminarUsuario(Enfermos_VO cliente) {
        enfermos.remove(cliente.getId());
        System.out.println("Usuario " + cliente.getId() + " eliminado satisfactoriamente");
    }
    

     public List<Enfermos_VO> obtenerUsuario() {
        return enfermos;
        }


    public Enfermos_VO ObtenerUsuario(int Id) {
            return enfermos.get(Id);
        }

    public void ActualizarUsuario(Enfermos_VO enfermo) {
        
        enfermos.get(enfermo.getId()).setEdad(enfermo.getEdad());
        enfermos.get(enfermo.getId()).setNombre(enfermo.getNombre());
        enfermos.get(enfermo.getId()).setEnfer(enfermo.getEnfer());
       


        System.out.println("Usuario con id: " + enfermo.getId() + " actualizado satisfactoriamente");
    }





















}
