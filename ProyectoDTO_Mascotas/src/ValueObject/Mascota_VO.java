/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObject;


public class Mascota_VO {
    
    
   private int codigo;
   private int edad;
   private String nom;
   private String anim;
   private String raza;

    public Mascota_VO(int codigo, int edad, String nom, String anim, String raza) {
        this.codigo = codigo;
        this.edad = edad;
        this.nom = nom;
        this.anim = anim;
        this.raza = raza;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnim() {
        return anim;
    }

    public void setAnim(String anim) {
        this.anim = anim;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

   @Override
   public String toString() {
        return this.getCodigo()+ " " + this.getEdad() + " " + this.getNom()+ " " + this.getAnim() + " " +this.getRaza();
    }
    


}
