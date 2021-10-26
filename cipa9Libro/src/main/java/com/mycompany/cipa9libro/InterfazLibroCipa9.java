package com.mycompany.cipa9libro;

import javax.swing.*;

public class InterfazLibroCipa9 {

    // SE DECLARAN LAS VARIABLES DE TIPO DIRECCION
    // CABECERA GUARADARA LA PRIMERA DIRRECION DE LA LISTA, P RECORRERA LA LISTA, NODO CREARA NUEVOS NODOS.
    public static Libro cabecera = null, p, nodo, Siguiente, fin=null;

    public static String titulo, autor, codigo;
    public static double precio;
    public static int estado;
    public static Libro siguiente;
    
    public static void nuevoLibro() {
        boolean existe=false;
        p=cabecera;
        codigo = JOptionPane.showInputDialog(null, "Digite Codigo Libro ");
          while (p != null & existe == false){
        
            if(p.getCodigo().equals(codigo)){
            
                existe=true;
            
            }else{
            
            p=p.siguiente;
            
            }
         
        }  
        if(existe==true){
         JOptionPane.showMessageDialog(null, "Codigo ya existente");

        } else{ 
        
        titulo = JOptionPane.showInputDialog(null, "Titutlo libro ");
        autor = JOptionPane.showInputDialog(null, "Autor Libro ");
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Precio Libro"));
        estado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1=Exc /2=Reg/ 3=Malo "));
        Siguiente = null;
        nodo = new Libro(codigo, titulo, autor, precio, estado, Siguiente);
        if (cabecera == null) {
            cabecera = nodo;
        } else {
            p = cabecera;
            while (p.getSiguiente() != null) {
                p = p.getSiguiente();
            }

            p.setSiguiente(nodo); // SE REALIZO EL ENLACE ENTRE NODOS

        }

        JOptionPane.showMessageDialog(null, "Libro agregado a la lista");
        }
    }
  

    public static void verLibros() {
        int i = 0;
        if (cabecera == null) {

            JOptionPane.showMessageDialog(null, "No Hay Libros");
            nuevoLibro();
        } else {

            p = cabecera;

            while (p != null) {

                JOptionPane.showMessageDialog(null, "Libro " + (i + 1) + " Almacenado" + "\nCodigo : " + p.getCodigo() + "\nTitulo: " + p.getTitulo()
                        + "\nAutor: " + p.getAutor()
                        + "\nPrecio: " + p.getPrecio() + " \nEstado: " + p.getEstado());
                p = p.getSiguiente();
                i++;
            }

        }

    }

    public static void BuscarLibro() {
        String libroBuscar;
        int Existe = 0;

        p = cabecera;
        if (cabecera == null) {

            JOptionPane.showMessageDialog(null, "No Hay Libros");
            nuevoLibro();
        } else {
            libroBuscar = JOptionPane.showInputDialog(null, "Digite Codigo del Libro de Libro a Buscar");

            while (p != null & Existe == 0) {

                if (p.getCodigo().equals(libroBuscar)) {
                    Existe = 1;
                } else {
                    p = p.getSiguiente();
                }
            }
            if (Existe == 0) {

                JOptionPane.showMessageDialog(null, "Libro no Encontrado");

            } else {

                JOptionPane.showMessageDialog(null, "Libro" + " Almacenado" + "\nCodigo : " + p.getCodigo() + "\nTitulo: " + p.getTitulo()
                        + "\nAutor: " + p.getAutor()
                        + "\nPrecio: " + p.getPrecio() + " \nEstado: " + p.getEstado());
            }
        }

    }

    public static void ModificarNom() {
        p = cabecera;
        int Existe = 0;
        String libroBuscar, nueNom;
        if (cabecera == null) {

            JOptionPane.showMessageDialog(null, "No Hay Libros");
            nuevoLibro();
        } else {
            libroBuscar = JOptionPane.showInputDialog(null, "Digite Codigo del Libro de Libro a Cambiar Nombre");

            while (p != null & Existe == 0) {

                if (p.getCodigo().equals(libroBuscar)) {
                    Existe = 1;
                    nueNom = JOptionPane.showInputDialog(null, "Digite Nuevo Nombre");
                    p.setTitulo(nueNom);

                } else {
                    p = p.getSiguiente();
                }
            }
            if (Existe == 0) {

                JOptionPane.showMessageDialog(null, "Libro no Encontrado/ No Registrado");

            } else {

                JOptionPane.showMessageDialog(null, "Libro" + " Almacenado" + "\nCodigo : " + p.getCodigo() + "\nTitulo: " + p.getTitulo()
                        + "\nAutor: " + p.getAutor()
                        + "\nPrecio: " + p.getPrecio() + " \nEstado: " + p.getEstado());
            }

        }
    }
    public static void EliminarPrimero(){
        
        if (cabecera == null) {

            JOptionPane.showMessageDialog(null, "No Hay Libros");
            nuevoLibro();
        } else {
                cabecera=cabecera.getSiguiente();
                JOptionPane.showMessageDialog(null, "Se ha eliminado el primer libro");
                 
            }
    }
    
    public static void EliminarNodo() {
        p = cabecera;
        boolean Existe = false;
        Libro temp = cabecera;
        Libro ant = null;
        String eliLibro;
  
        if (cabecera == null) {

            JOptionPane.showMessageDialog(null, "¡No Hay Libros!");
            nuevoLibro();
        } else {
             eliLibro  = JOptionPane.showInputDialog(null, "Digite Codigo del Libro a Eliminar");
           
            while (temp != null & Existe == false) {

                if (temp.getCodigo().equals(eliLibro)) {
                  
                    if (ant == null) {
                       
                        cabecera = temp.getSiguiente();
                        temp.setSiguiente(null);

                    } else {
                        ant.setSiguiente(temp.getSiguiente());
                        temp.setSiguiente(null);                        
                    }
                  Existe=true;
                }
                ant=temp;
                temp=temp.getSiguiente();
            }
            if (Existe == false) {

                JOptionPane.showMessageDialog(null, "¡Libro no Existente!");
                
            } else {
               JOptionPane.showMessageDialog(null, "¡Libro eliminado con exito, Lista de Libros Actualizada!");
              // verLibros();
              
            }

        }

    }


    public static void main(String[] args) {

        int menu;

        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal" + 
                    "\n+------------+" + "\n 1: Nuevo Libro" +
                    "\n 2: Ver Libros " + "\n 3: Buscar Libro" +
                    "\n 4: Modificar Titulo Libro" + "\n 5: Eliminar Primer Libro "+
                    "\n 6: Eliminar Libro  "+"\n 7: Salir " ));

            switch (menu) {

                case 1: {
                    nuevoLibro();
                    break;
                }
                case 2: {

                    verLibros();

                    break;
                }
                case 3: {

                    BuscarLibro();

                    break;
                }
                case 4: {

                    ModificarNom();

                    break;
                }
                 case 5: {
                
                   EliminarPrimero();

                    break;
                }
                 case 6: {
                     
                    EliminarNodo();
                    
                    break;
                }
                case 7: {

                    System.exit(0);

                    break;
                }

            }

        } while (menu != 7);

    }

}
