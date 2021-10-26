/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nocipas5;

/**
 *
 * @author HP
 */
import javax.swing.*;

public class InterfazMatrizcipa05{
    static Numerocipas05 matriz [][];
    static int TamFila,TamCol;
    static int f,c;
    static int num;
    public static void LongitudMatriz()
    {
        TamFila=Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Tamaño Fila"));
        TamCol=Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Tamaño Columnas"));
        matriz=new Numerocipas05 [TamFila] [TamCol];
        JOptionPane.showMessageDialog(null,"Matriz creada con exito");
    }
public static void Llenarmatriz()
{
    for (f=0;  f<TamFila; ++f)
    {
        for (c=0; c<TamCol; ++c)
        {
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite valor para la posición: "
                    + "["+(f+1)+","+(c+1)+"] de la Matriz."));
            matriz[f][c]=new Numerocipas05(num);
        }
    }JOptionPane.showMessageDialog(null,"Matriz Llena");    
}
 
public static void VerMatrizConsola(){
    for (f=0;  f<TamFila; ++f)
    {
        for (c=0; c<TamCol; ++c)
        {
            System.out.print(" "+matriz [f][c].getNum());
        }
        System.out.println();
    }
}

public static void VerMatrizCaja(){
    String cuadro="";
    for (f=0;  f<TamFila; f++)
    {
        for (c=0; c<TamCol; c++)
        {
            cuadro += matriz[f][c].getNum() + "\t";
            cuadro += "     ";
        } 
        cuadro += "\n";
    }JOptionPane.showMessageDialog(null,cuadro);   
}

public static void ParesImpares(){
    int pares=0, impares=0; 
     for (f=0;  f<TamFila; f++)
    {
        for (c=0; c<TamCol; c++)
        {
            if(matriz[f][c].getNum()%2== 0 )
            {
                pares= pares+1;
            }else{
                impares=impares+1;
            }
        }
    }JOptionPane.showMessageDialog(null,"La matriz tiene \n["+pares+"] Numeros pares \n["+impares+"] Numeros impares");
}

public static void main(String args[]){
    
    int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"                MENU PRINCIPAL "+
                "\n1.TAMAÑO DE LA MATRIZ \n2.LLENAR MATRIZ \n3.VER MATRIZ EN CONSOLA \n4.VER MATRIZ EN CAJA DE DIALOGO " 
                    +"\n5.VER LA CANTIDAD DE NUMEROS PARES E IMPARES "+ "\n 6.SALIR "));
            switch(opc)
            {
            case 1:{LongitudMatriz();}break;
            case 2:{Llenarmatriz();}break;
            case 3:{VerMatrizConsola();}break;
            case 4:{VerMatrizCaja();}break;
            case 5:{ParesImpares();}break;
            case 6:{System.exit(0);}break;
            default: JOptionPane.showMessageDialog(null,"ERROR... opción no válida!!!");
            }
        }while (opc!=6);
    }
}