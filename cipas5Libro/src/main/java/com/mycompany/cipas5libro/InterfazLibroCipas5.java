/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cipas5libro;

import javax.swing.*;

public class InterfazLibroCipas5 {
    
    public static libro cabecera=null,p,nodo,siguiente;
    
    public static String codigo;
    public static String titulo;
    public static String autor;
    public static double precio;
    public static String estado;
    
    public static void NuevoLibro(){
        codigo=JOptionPane.showInputDialog(null, "Dijite código libro");
        titulo=JOptionPane.showInputDialog(null, "Dijite Título del libro");
        autor=JOptionPane.showInputDialog(null, "Dijite Autor del libro");
        precio=Double.parseDouble(JOptionPane.showInputDialog(null, "Dijite precio libro"));
        estado=JOptionPane.showInputDialog(null, "Dijite estado del libro \n1=Nuevo \n2=Usado \n3=Dañado");
        switch (estado){
                    case "1" :estado = "Nuevo";break;
                    case "2" :estado = "Usado";break; 
                    case "3" :estado = "Dañado";break;   
                    default: JOptionPane.showMessageDialog(null,"ERROR... opción no válida!!!");
                    }
        
        siguiente=null;
        nodo= new libro(codigo, titulo,autor, precio,estado,siguiente);
        
        if(cabecera==null){
            cabecera=nodo;
        }else{
            p=cabecera;
            while(p.getSiguiente()!=null){
                p=p.getSiguiente();
            }
            p.setSiguiente(nodo);
        }
        JOptionPane.showMessageDialog(null,"Libro Agregado a la lista");
    }
    public static void VerLibros(){
        if (cabecera==null){
            JOptionPane.showMessageDialog(null,"No hay libros");
        }else{
            p=cabecera;
            while(p!=null){
                JOptionPane.showMessageDialog(null,"Codigo: "+p.getCodigo()
                    +"\nTítulo: "+p.getTitulo()
                    +"\nAutor: "+p.getAutor()
                    +"\nPrecio: "+p.getPrecio()
                    +"\nEstado: "+p.getEstado());
                p=p.getSiguiente();
            }
        }
    }
    
    public static void buscarLibroEstadoExcelnt() {

        int liExc=0;
        p = cabecera;
        
        if (cabecera == null) {

            JOptionPane.showMessageDialog(null, "No Hay Libros");
            NuevoLibro();
        } else {
            while (p != null ) {
                if (p.getEstado().equalsIgnoreCase("Nuevo")) {
                    JOptionPane.showMessageDialog(null, "Codigo: " + p.getCodigo()
                            + "\nTítulo: " + p.getTitulo()
                            + "\nAutor: " + p.getAutor()
                            + "\nPrecio: " + p.getPrecio()
                            + "\nEstado: " + p.getEstado());
                    p = p.getSiguiente();
                    liExc++;
                } else {
                    p = p.getSiguiente();
                }
            }
            JOptionPane.showMessageDialog(null, "LIBROS EN EXCELENTE ESTADO: " + liExc);
        }
    }

    public static void main(String args[])
    {
        int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"                MENU PRINCIPAL"+
                "\n 1.Ingresar Libro \n 2.Ver Libros \n 3. Buscar libros en Excelente Estado \n 4.SALIR"));
            switch(opc)
            {
            case 1:{NuevoLibro();}break;
            case 2:{VerLibros();}break;
            case 3:{buscarLibroEstadoExcelnt();}break;
            case 4:{System.exit(0);}break;
            default: JOptionPane.showMessageDialog(null,"ERROR... opción no válida!!!");
            }
        }while (opc!=4);
    }
}
