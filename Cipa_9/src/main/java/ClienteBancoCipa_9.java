/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ClienteBancoCipa_9 {
   
    int numcuenta;
    String numced;
    String nombre;
    Double capital;
    int tipoCuenta;

    public ClienteBancoCipa_9() {
        this.numcuenta = 0;
        this.numced ="" ;
        this.nombre ="";
        this.capital = 0.0;
        this.tipoCuenta = 0;
    }

    public ClienteBancoCipa_9(int numcuenta, String numced, String nombre, Double capital, int tipoCuenta) {
        this.numcuenta = numcuenta;
        this.numced = numced;
        this.nombre = nombre;
        this.capital = capital;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public String getNumced() {
        return numced;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCapital() {
        return capital;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setNumced(String numced) {
        this.numced = numced;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    
    
    
    
    
    
    
    
}
