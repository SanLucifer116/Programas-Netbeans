/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cipas_5;

public class ClienteBanco5 {
    
    int NumCuenta;
    String NumCed;
    String Nombre;
    double Capital;
    String TipoCuenta;
    
    public ClienteBanco5()
    {
        this.NumCuenta=0;
        this.NumCed="";
        this.Nombre="";
        this.Capital=0.0;
        this.TipoCuenta="";
    
    }
    public  ClienteBanco5(int NumCuenta, String NumCed, String Nombre, double Capital,String TipoCuenta )
    {
        this.NumCuenta=NumCuenta;
        this.NumCed=NumCed;
        this.Nombre=Nombre;
        this.Capital=Capital;
        this.TipoCuenta=TipoCuenta;
    
    
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public String getNumCed() {
        return NumCed;
    }

    public void setNumCed(String NumCed) {
        this.NumCed = NumCed;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCapital() {
        return Capital;
    }

    public void setCapital(double Capital) {
        this.Capital = Capital;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }
     
    
    
}
