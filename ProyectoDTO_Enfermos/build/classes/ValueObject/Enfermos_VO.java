/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObject;

/**
 *
 * @author HP
 */
public class Enfermos_VO {
    
    private int id;
    private int edad;
    private String Nombre;
    private String enfer;

    public Enfermos_VO(int id, int edad, String Nombre, String enfer) {
        this.id= id;
        this.edad = edad;
        this.Nombre = Nombre;
        this.enfer = enfer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEnfer() {
        return enfer;
    }

    public void setEnfer(String enfer) {
        this.enfer = enfer;
    }
    
    
    @Override
   public String toString() {
        return this.getId()+ " " + this.getEdad() + " " + this.getNombre()+ " " + this.getEnfer();
    }

    
    













}
