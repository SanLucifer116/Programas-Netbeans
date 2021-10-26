/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDto;

import ValueObject.Mascota_VO;
import BusinessObject.Mascotas_BO;


public class Dto {
    
    public static void main(String[] args) {
    
    //CREA EL OBJETO 
        Mascotas_BO mascotaBusinessObject = new Mascotas_BO();
    
    //OBTIENE LAS MASCOTAS
    
        mascotaBusinessObject.obtenerClientes().forEach(System.out::println);

    
    
    // ACTUALIZAR DATOS MASCOTA
        System.out.println("**");
        Mascota_VO mascota = mascotaBusinessObject.ObtenerMascota(2);
        mascota.setNom("Lola");
        mascotaBusinessObject.actualizarCliente(mascota);
    
    
    // OBTENER UNA MASCOTA
        System.out.println("**");
        mascota = mascotaBusinessObject.ObtenerMascota(2);
        System.out.println(mascota);
    
    
    //ELIMINAR UNA MASCOTA
        System.out.println("*******");
        mascota = mascotaBusinessObject.ObtenerMascota(2);
       mascotaBusinessObject.EliminarMascota(mascota);
     }
    
   
   }
















