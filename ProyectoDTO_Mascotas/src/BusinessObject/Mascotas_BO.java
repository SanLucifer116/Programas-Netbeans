/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObject;


import java.util.ArrayList;
import java.util.List;
import ValueObject.Mascota_VO;



public class Mascotas_BO {
    
   
    List<Mascota_VO> mascotas;


    public Mascotas_BO() {
        mascotas= new ArrayList<>();
        Mascota_VO mascota1 = new Mascota_VO(1, 2 , "Laica", " Perro", "Labrador");
        Mascota_VO mascota2 = new Mascota_VO(3, 9,"Priscila", "Gato", "Persa");
        Mascota_VO mascota3 = new Mascota_VO(2, 5 ,"Rodolfito", "Ave", "Perico");
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
    }

    //Metodo para eliminar Mascotas
    public void EliminarMascota(Mascota_VO mascota) {
        mascotas.remove(mascota.getCodigo());
        System.out.println("Mascota " + mascota.getCodigo() + " Ha sido eliminada");
    }

    //obtiene lista mascotas

    public List<Mascota_VO> obtenerClientes() {
        return mascotas;
    }

    //obtiene un cliente de acuerdo al id pasado como parámetro

    public Mascota_VO ObtenerMascota(int Codigo) {
        return mascotas.get(Codigo);
    }

    // actualiza el cliente que se le pasa como parámetro

    public void actualizarCliente(Mascota_VO mascota) {
        
        mascotas.get(mascota.getCodigo()).setEdad(mascota.getEdad());
        mascotas.get(mascota.getCodigo()).setNom(mascota.getNom());
        mascotas.get(mascota.getCodigo()).setAnim(mascota.getAnim());
        mascotas.get(mascota.getCodigo()).setRaza(mascota.getRaza());


        System.out.println("Mascota con Codigo: " + mascota.getCodigo() + " actualizado satisfactoriamente");
    }


}
















