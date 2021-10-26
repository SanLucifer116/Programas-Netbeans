/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;
import Modelo.Jugador;
import Vista.JugadorView;
import Controlador.JugadorController;
import javax.swing.*;



public class JugadorDemo {
   
     public static Jugador VectorJugador[]; // VECTOR CLASE
     public static  int n=2;
     public static int cont=0; 
     public static int sw = 0; 
     public static int sw2 = 0;
     
     
     //METODO 1
     
     public static void Tamvec(){
     sw =1;//CAMBIO VALOR VARIABLE ESTADO
     VectorJugador = new Jugador[n];
    }
     
     //METODO 2
     
     public static void LlenarVector(){
         String nombre= " ";
         String rol= " ";
         String elo= " ";
         int edad=0;
        
        sw=1;
            if(cont<n){
               JugadorView  llamado = new JugadorView() ;
               llamado.AgregarJugador(nombre, rol, edad, elo);
                    
                cont++;        
                    
                JOptionPane.showMessageDialog(null, "Jugadores Creados");
                
            }
         
         sw2=1;
     }
     //METODO 3
     
     public static void VerEquipo(){
         String nombre= " ";
         String rol= " ";
         String elo= " ";
         int edad=0;
          if (sw==1){
             if (sw2==1){ 
        
              JugadorController vista= new JugadorController();
             
               vista.Jugadorvista();
 
              //  JugadorView vista= new Jugador( nombre, rol,  edad, elo);
               
             //  JOptionPane.showMessageDialog(null, "Nombre: " + vista.getNombre()+ " Rol: " + vista.getRol()+ " Edad: " + vista.getEdad() + "Elo: " + vista.getElo());

                cont++;  
                
               }else{
                    JOptionPane.showMessageDialog(null, "El vector esta vacio");
                    sw2=1;//CAMBIO VALOR VARIABLE ESTADO3
                 }
            }else{
            JOptionPane.showMessageDialog(null, "Favor Ingresar Jugadores");
            LlenarVector();
            sw=1;//CAMBIO VALOR VARIABLE ESTADO
            }
    }
     
     
     
    
     @SuppressWarnings("empty-statement")
    public static void main (String [] args){
             
        int menu;
    

        
        do{
        
         menu=Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal"+"\n+------------+"+"\n 1:Ingresar Jugadores"+ "\n 2: Ver Jugadores"+"\n 3: Salir"  ));
           
        
             switch (menu){
                 case 1:{
                     LlenarVector();
                     break;
                    } 
                 case 2:{
                  
                     VerEquipo();
                      break;
                    }
             }
                
        
                  
         }while(menu!=3);
      
       




    }

     
      
    
    
}
